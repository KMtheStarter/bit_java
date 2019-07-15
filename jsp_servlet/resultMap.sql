insert into sawon_phone values(1, '갤럭시노트9', '010-1234-1234', sysdate);
insert into sawon_phone values(3, 'lg9', '010-2233-4455', sysdate);
insert into sawon_phone values(8, '아이폰XE', '010-3344-4455', sysdate);
insert into sawon_phone values(10, '갤럭시8', '010-4455-5566', sysdate);
insert into sawon_phone values(11, '갤럭시9', '010-5566-6677', sysdate);
insert into sawon_phone values(12, '갤럭시노트10', '010-6677-7788', sysdate);
commit;

select * from sawon_phone;
select * from dept;

select deptno, dname, loc location from dept order by 1 desc;

-- null을 가진 쪽에 조인.
select s.sabun sabun, s.saname saname, s.sajob sajob, p.pnum pnum, p.pmodel pmodel, p.phnum phnum,
p.pdate pdate from sawon s, sawon_phone p where s.sabun=p.pnum(+);