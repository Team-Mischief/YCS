drop table if exists code;
drop table if exists dev;
drop sequence if exists code_seq;
drop sequence if exists dev_seq;

create table dev (
	developer_id number primary key,
	picture varchar2(1001),
	handle varchar2(50)
);

create table code (
	code_id number primary key,
	snippet varchar2(1001),
	developer_id number not null,
	constraint fk_code_dev foreign key (developer_id) references dev(developer_id)
);

create sequence dev_seq;
create sequence code_seq;

insert into dev(developer_id, picture, handle) 
	select nextVal('dev_seq'), 'https://avatars1.githubusercontent.com/u/24252526?s=460&v=4', 'richard';
insert into dev(developer_id, picture, handle) select nextVal('dev_seq'), 'https://avatars1.githubusercontent.com/u/10458336?s=460&v=4', 'nick';
insert into dev(developer_id, picture, handle) select nextVal('dev_seq'), 'https://avatars3.githubusercontent.com/u/52462571?s=460&v=4', 'emily';
insert into dev(developer_id, picture, handle) select nextVal('dev_seq'), 'https://avatars0.githubusercontent.com/u/27315031?s=460&v=4', 'adam';
insert into dev(developer_id, picture, handle) select nextVal('dev_seq'), 'https://avatars2.githubusercontent.com/u/33093819?s=460&v=4', 'kittenkillzu';
insert into dev(developer_id, picture, handle) select nextVal('dev_seq'), 'https://avatars1.githubusercontent.com/u/46352295?s=460&v=4', 'william';
insert into dev(developer_id, picture, handle) select nextVal('dev_seq'), 'https://avatars0.githubusercontent.com/u/56270899?s=460&v=4', 'caroline';

insert into code(code_id, snippet, developer_id)
	select  nextVal('code_seq'), 'System.out.println("Hello World")', (select developer_id from dev where handle='nick');
insert into code(code_id, snippet, developer_id)
	select  nextVal('code_seq'), 'System.out.println("Goodbye")', (select developer_id from dev where handle='nick');
insert into code(code_id, snippet, developer_id)
	select  nextVal('code_seq'), 'System.out.println("Hi")', (select developer_id from dev where handle='richard');
insert into code(code_id, snippet, developer_id)
	select  nextVal('code_seq'), 'System.out.println("Kitten Kills You")', (select developer_id from dev where handle='kittenkillzu');

commit;