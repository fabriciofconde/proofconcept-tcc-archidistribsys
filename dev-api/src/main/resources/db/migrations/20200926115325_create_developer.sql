create table developers (
    id int4 not null,
    avatar_url varchar(255),
    bio varchar(4000),
    company varchar(255),
    created_at timestamp not null,
    edited_at timestamp not null,
    email varchar(255),
    followers int4,
    following int4,
    github_member_since timestamp,
    location varchar(255),
    name varchar(255) not null,
    public_repository int4,
    twitter_username varchar(255),
    username varchar(100) not null,
    primary key (id)
);

alter table developers add constraint UK_3d0prvtkuetxblfukd7td5r96 unique (username);

create sequence sq_developers start 1 increment 1;