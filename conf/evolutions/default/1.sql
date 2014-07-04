# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table answer (
  id                        bigint not null,
  answer                    varchar(255),
  date_anwsered             timestamp,
  fk_question               bigint,
  fk_user                   bigint,
  constraint pk_answer primary key (id))
;

create table forum (
  date_init                 timestamp,
  fk_user                   bigint)
;

create table question (
  question                  varchar(255),
  description               varchar(255),
  fk_user                   bigint)
;

create table user (
  name                      varchar(255),
  cpf                       varchar(255),
  email                     varchar(255),
  password                  varchar(255))
;

create sequence answer_seq;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists answer;

drop table if exists forum;

drop table if exists question;

drop table if exists user;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists answer_seq;

