create table repositories (
    id int4 not null,
    description varchar(255),
    developer_id int4 not null,
    fork boolean not null,
    forks int4 not null,
    name varchar(255),
    size int4,
    updated_at timestamp,
    watchers int4 not null,
    primary key (id)
);

alter table repositories
   add constraint FKfj90y8gtmsd8s1x2p2vibpsdn
   foreign key (developer_id)
   references developers;

create sequence sq_repositories start 1 increment 1;

create index ix_repo_developerid on repositories(developer_id);