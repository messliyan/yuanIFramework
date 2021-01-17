-- 医生常用语编辑的数据字典

INSERT INTO s_yuan.t_dict_type
(dict_name, dict_label, status, create_by)
VALUES('医生常用语', 'WS_doctors', 0, 'admin');
ALTER TABLE s_yuan.t_dict_type ALTER COLUMN deleted_at DROP NOT NULL;
ALTER TABLE s_yuan.t_dict_data ALTER COLUMN deleted_at DROP NOT NULL;
