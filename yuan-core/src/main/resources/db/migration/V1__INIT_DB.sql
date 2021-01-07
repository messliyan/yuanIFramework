CREATE SCHEMA IF NOT EXISTS s_yuan;
SET search_path TO 's_yuan';

-- 创建日期和更新日期的函数

CREATE FUNCTION s_yuan.created_at_function() RETURNS trigger
    LANGUAGE plpgsql
AS $$
declare
    t timestamptz;
BEGIN
    t := now();
    NEW.created_at = t;
    NEW.updated_at = t;
    RETURN NEW;
END;
$$;


CREATE FUNCTION s_yuan.updated_at_function() RETURNS trigger
    LANGUAGE plpgsql
AS $$
BEGIN
    -- ASSUMES the table has a column named exactly "updated_at".
    -- Fetch date-time of actual current moment from clock, rather than start of statement or start of transaction.
    NEW.updated_at = clock_timestamp();
    RETURN NEW;
END;
$$;
