/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2013/11/17 13:32:47                          */
/*==============================================================*/


drop table if exists Relation;

drop table if exists errorinfo;

drop table if exists location;

drop table if exists payrecord;

drop table if exists pushusr;

drop table if exists society;

drop table if exists track;

drop table if exists user;

/*==============================================================*/
/* Table: Relation                                              */
/*==============================================================*/
create table Relation
(
   relationid           int not null,
   userid               int,
   use_userid           int,
   name                 varchar(100) not null,
   state                int not null comment '0 失效
            1 有效
            ',
   icon                 int,
   primary key (relationid)
);

/*==============================================================*/
/* Table: errorinfo                                             */
/*==============================================================*/
create table errorinfo
(
   logid                int not null,
   detail               varchar(1024),
   createtime           date,
   primary key (logid)
);

/*==============================================================*/
/* Table: location                                              */
/*==============================================================*/
create table location
(
   locationid           int not null,
   userid               int,
   longitude            int not null,
   latitude             int not null,
   createtime           date not null,
   provider             int not null comment '1 基站
            2 wifi
            3 GPS
            4 百度',
   primary key (locationid)
);

/*==============================================================*/
/* Table: payrecord                                             */
/*==============================================================*/
create table payrecord
(
   recordid             int not null,
   userid               int,
   paymoney             float(8,2) not null,
   paytype              int not null comment '1 普通月卡
            2 VIP月卡',
   startdate            date not null,
   enddate              date not null,
   paydate              date,
   paystate             char(10) comment '0 失效
            1 有效',
   primary key (recordid)
);

/*==============================================================*/
/* Table: pushusr                                               */
/*==============================================================*/
create table pushusr
(
   sid                  int not null,
   mblno                int,
   createtime           date,
   pushuserid           varchar(64) binary,
   baiduchannelid       varchar(19) binary,
   userid               int,
   primary key (sid)
);

/*==============================================================*/
/* Table: society                                               */
/*==============================================================*/
create table society
(
   userid               int,
   soid                 int,
   type                 int comment '1 qq号
            2 新浪微博
            3 微信
            4 人人网',
   account              varchar(100)
);

/*==============================================================*/
/* Table: track                                                 */
/*==============================================================*/
create table track
(
   trackid              int not null,
   relationid           int,
   pointlongitude       int,
   pointlatitude        int,
   Algorithm            int comment '1 圆形算法
            2 正方形算法',
   Radius               numeric(8,0) comment '已中心点开始的半径长度，单位为km',
   Path                 char(10) comment '预留字段，为以后特殊监控准备',
   primary key (trackid)
);

/*==============================================================*/
/* Table: user                                                  */
/*==============================================================*/
create table user
(
   id                   int not null,
   macaddress           varchar(100) not null comment '手机号mac地址',
   phonenumber          varchar(100),
   createtime           date,
   lasttime             date,
   primary key (id)
);

alter table Relation add constraint FK_fk_myid foreign key (userid)
      references user (id) on delete restrict on update restrict;

alter table Relation add constraint FK_fk_otherid foreign key (use_userid)
      references user (id) on delete restrict on update restrict;

alter table location add constraint FK_fk_location foreign key (userid)
      references user (id) on delete restrict on update restrict;

alter table payrecord add constraint FK_fk_record foreign key (userid)
      references user (id) on delete restrict on update restrict;

alter table society add constraint FK_fk_society foreign key (userid)
      references user (id) on delete restrict on update restrict;

alter table track add constraint FK_fk_track foreign key (relationid)
      references Relation (relationid) on delete restrict on update restrict;

