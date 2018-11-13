create table cha_channel
(
  id          int                    not null
    primary key,
  cha_code    varchar(8)             not null
  comment '业务接口编码',
  cipher_text text                   not null
  comment '字段合并密文',
  sequence    varchar(24) default '' not null
  comment 'SM4加密后序列',
  save_time   datetime               not null
  comment '存储时间',
  constraint cha_code_index
  unique (cha_code)
);
