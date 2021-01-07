-- sih entity sequence 自增序列
CREATE SEQUENCE s_yuan.seq_dict_type
    INCREMENT 1
    START 1000
    MINVALUE 1;
COMMENT ON SEQUENCE s_yuan.seq_dict_type IS '字典类型唯一序列';

-- t_dict_type 字典类型表
CREATE TABLE s_yuan.t_dict_type
(
    dict_id    BIGINT      NOT NULL DEFAULT nextval('s_yuan.seq_dict_type') PRIMARY KEY,
    dict_name  TEXT        NOT NULL,
    dict_label TEXT        NOT NULL,
    status     INTEGER     NOT NULL DEFAULT 0,
    create_by  TEXT                 DEFAULT NULL,
    update_by  TEXT                 DEFAULT NULL,
    created_at timestamptz NOT NULL DEFAULT current_timestamp,
    updated_at timestamptz NOT NULL DEFAULT current_timestamp,
    deleted_at timestamptz NOT NULL DEFAULT current_timestamp,
    remark     TEXT                 DEFAULT NULL
);

COMMENT ON TABLE s_yuan.t_dict_type IS '字典类型表';
COMMENT ON COLUMN s_yuan.t_dict_type.dict_id IS '字典类型主键';
COMMENT ON COLUMN s_yuan.t_dict_type.dict_name IS '字典名称';
COMMENT ON COLUMN s_yuan.t_dict_type.dict_label IS '字典类型';
COMMENT ON COLUMN s_yuan.t_dict_type.status IS '字典启用状态 状态（0正常 1停用）';
COMMENT ON COLUMN s_yuan.t_dict_type.create_by IS '创建人';
COMMENT ON COLUMN s_yuan.t_dict_type.update_by IS '更新人';
COMMENT ON COLUMN s_yuan.t_dict_type.remark IS '备注';


-- seq_dict_data 字典数据表
CREATE SEQUENCE s_yuan.seq_dict_data
    INCREMENT 1
    START 1000
    MINVALUE 1;
COMMENT ON SEQUENCE s_yuan.seq_dict_data IS '字典数据的唯一序列号';

CREATE TABLE s_yuan.t_dict_data
(
    id         BIGINT      NOT NULL DEFAULT nextval('s_yuan.seq_dict_data') PRIMARY KEY,
    name       TEXT        NOT NULL,
    dict_value TEXT                 DEFAULT NULL,
    dict_sort  INTEGER     NOT NULL,
    dict_type  TEXT        NOT NULL,
    dict_code  TEXT                 DEFAULT NULL,
    status     INTEGER     NOT NULL DEFAULT 0,
    create_by  TEXT                 DEFAULT NULL,
    update_by  TEXT                 DEFAULT NULL,
    created_at timestamptz NOT NULL DEFAULT current_timestamp,
    updated_at timestamptz NOT NULL DEFAULT current_timestamp,
    deleted_at timestamptz NOT NULL DEFAULT current_timestamp,
    remark     TEXT                 DEFAULT NULL
);
COMMENT ON TABLE s_yuan.t_dict_data IS '字典数据表';
COMMENT ON COLUMN s_yuan.t_dict_data.id IS '字典数据主键';
COMMENT ON COLUMN s_yuan.t_dict_data.name IS '字典数据名称';
COMMENT ON COLUMN s_yuan.t_dict_data.dict_value IS '字典数据类别代码';
COMMENT ON COLUMN s_yuan.t_dict_data.dict_sort IS '字典数据排序';
COMMENT ON COLUMN s_yuan.t_dict_data.dict_code IS '类别预留字段';
COMMENT ON COLUMN s_yuan.t_dict_data.dict_type IS '字典数据类型和字典类型表中的类型一致';
COMMENT ON COLUMN s_yuan.t_dict_data.status IS '字典数据启用状态 状态（0正常 1停用） ';
COMMENT ON COLUMN s_yuan.t_dict_data.create_by IS '创建人';
COMMENT ON COLUMN s_yuan.t_dict_type.update_by IS '更新人';
COMMENT ON COLUMN s_yuan.t_dict_data.remark IS '备注';

-- ----------------------------
-- Triggers structure for table t_dict_type 触发器自动添加创建和更新日期
-- ----------------------------
    CREATE TRIGGER "created_at_t_dict_type" BEFORE INSERT ON "s_yuan"."t_dict_type"
    FOR EACH ROW
    EXECUTE PROCEDURE "s_yuan"."created_at_function"();

CREATE TRIGGER "updated_at_t_dict_type" BEFORE UPDATE ON "s_yuan"."t_dict_type"
    FOR EACH ROW
    EXECUTE PROCEDURE "s_yuan"."updated_at_function"();

-- ----------------------------
-- Triggers structure for table t_dict_data
-- ----------------------------
    CREATE TRIGGER "created_at_t_dict_data" BEFORE INSERT ON "s_yuan"."t_dict_data"
    FOR EACH ROW
    EXECUTE PROCEDURE "s_yuan"."created_at_function"();

CREATE TRIGGER "updated_at_t_dict_data" BEFORE UPDATE ON "s_yuan"."t_dict_data"
    FOR EACH ROW
    EXECUTE PROCEDURE "s_yuan"."updated_at_function"();
