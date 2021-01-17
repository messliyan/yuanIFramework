pipeline {
  agent any
  options {
        timeout(time: 15, unit: 'MINUTES')
   }
   tools {
           gradle "gradle"
           jdk "jdk"
   }
  stages {
        stage('prepare') {
            steps {
                script {
                    if (env.BRANCH_NAME == 'main') {
                       sh 'echo "开始构建当前main分支!!!"'

                    } else {
                        sh 'echo "当前分支暂未支持流水线作业!!!" && exit 1'
                    }
                }
            }
        }
        stage('checkout code') {
            steps {
             sh 'echo "开始拉取代码!!!"'
                git branch: "${BRANCH_NAME}",
                    credentialsId: "jiabin-github",
                    url: "https://github.com/messliyan/yuanIFramework.git"
                sh "ls -lat"
            }
        }

        stage('build') {

            steps {
                sh 'gradle -v'
                sh 'gradle -Dorg.gradle.daemon=false clean'
                sh '''
                    echo " ->（1）构建打包 (Fat Jar)"
                    gradle -Dorg.gradle.daemon=false build -x compileTestJava
                '''
                sh '''
                    echo " ->（2）构建Docker 镜像"
                    docker build \
                     -t yuan/iFramework/image \
                     ${WORKSPACE}
                '''
                 sh 'echo "（3）Docker 镜像上传入库"'
            }
        }

        stage('deploy') {

            steps {
                echo " ->（4）部署 Docker 镜像"
                script {
                        try {
                            writeFile file: "yuan_iFramework-pre-deploy.sh", text: '#!/bin/bash \n ' +
                                    'echo " -> （4.1）尝试清理原有运行资源" \n ' +
                                    'docker stop yuan/iFramework/container || true \n' +
                                    'docker container rm -f yuan/iFramework/container || true \n' +
                                    'docker image rmi --force yuan/iFramework/image || true \n'

                            sh 'bash yuan_iFramework-pre-deploy.sh'
                        } catch (exc) {
                            sh 'echo "首次运行在该机器，所以清理失败!"'
                            //throw
                        } finally {
                            writeFile file: "yuan_iFramework-deploy.sh", text: '#!/bin/bash \n' +
                                    'echo " -> （4.2） 部署 Docker 镜像到目标服务器"\n' +
                                    'docker run --log-opt max-size=10m --log-opt max-file=5 \\\n' +
                                    '-d --restart=always  \\\n' +
                                    '-p 9900:9900 \\\n' +
                                    '--name yuan/iFramework/container yuan/iFramework/image'
                             sh 'bash yuan_iFramework-deploy.sh'
                        }
                    }
            }
        }

        stage('clean') {

            steps {
//                TODO: clear docker image of local host
                sh 'echo "清理构建输出的制品"'
//                sh 'docker image rmi --force ${DOCKER_REGISTRY_IMAGE_TARGET} || true'
            }
        }
    }

    post {
        success {
            sh "echo suc!"
        }

        failure {
            sh "echo fail!"
        }
    }
}


