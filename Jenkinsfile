pipeline {
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
                sh 'gradle -Dorg.gradle.daemon=false clean'
                sh '''
                    echo " ->（1）构建打包 (Fat Jar)"
                    gradle -Dorg.gradle.daemon=false build -x compileTestJava
                '''
                 sh 'echo "（2）构建Docker 镜像"'
                 sh 'echo "（3）Docker 镜像上传入库"'
            }
        }

        stage('deploy') {
            steps {
                echo " ->（4）部署 Docker 镜像到目标服务器"
            }
        }

        stage('clean') {
            agent {
                label AGENT_LABEL as String
            }
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


