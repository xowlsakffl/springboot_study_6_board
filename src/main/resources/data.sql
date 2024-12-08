insert into user_account(user_id, user_password, nickname, email, memo, created_at, created_by, modified_at, modified_by) values ('ams', '1234', 'an', 'ms1114@kakao.com', 'memo', now(), 'ams', now(), 'ams');

insert into board.article(user_account_id, title, content, hashtag, created_at, modified_at, created_by, modified_by) values ('테스트1', '테스트 내용', '#테스트', '2024-12-02 00:00:00', '2024-12-02 00:00:00', 'ams', 'ams');

insert into board.article_comment(article_id, content, created_at, modified_at, created_by, modified_by) values (1,'테스트 내용', '2024-12-02 00:00:00', '2024-12-02 00:00:00', 'ams', 'ams');







