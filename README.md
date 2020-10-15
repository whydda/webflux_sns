# 몽고디비 설치 방법

## brew 는 명령어로 설치

```
$ brew tap mongodb/brew
$ brew install mongodb-community@4.2 or 4.3 or 4.4
```

### 데이터를 저장할 경로 만들기

---

```
$ whoami  // 사용자명이 나온다.
$ sudo mkdir -p /Users/[username]/data/db.
//위 명령을 치면 password 를 입력하라고 나오는데, mac 비밀번호를 입력하면 된다.
```

### 서버 실행 종료 명령어

---

```
$ brew services start mongodb-community@4.2
$ brew services stop mongodb-community@4.2
```

### 몽고디비 프롬프트에 접속 과 데이터베이스 생성

---

```
$ ps aux | grep -v grep | grep mongod

whydda           22726   0.2  0.2  5606652  30140   ??  S     1:27AM   0:05.40 /usr/local/opt/mongodb-community@4.2/bin/mongod --config /usr/local/etc/mongod.conf

cd /usr/local/opt/mongodb-community@4.2/bin
./mongo

> 프롬프트에 접속
> use whydda -- 데이터베이스 생성
> db.createUser({ user: 'whydda', pwd: '1234', roles: ['root']})
successfully added user: { 'user' : 'root' , 'roles' : ['root']}
```