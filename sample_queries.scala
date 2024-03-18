val q1 = "SELECT COUNT(*) FROM badges as b, users as u WHERE b.UserId= u.Id AND u.UpVotes>=0;"
val q2 = "SELECT COUNT(*) FROM comments as c, badges as b WHERE c.UserId = b.UserId AND c.Score=0 AND b.Date<=to_timestamp('2014-09-11 14:33:06');"
val q3 = "SELECT COUNT(*) FROM comments as c, postHistory as ph WHERE c.UserId = ph.UserId AND c.Score=0 AND ph.PostHistoryTypeId=1;"
val q4 = "SELECT COUNT(*) FROM comments as c, postHistory as ph WHERE c.UserId = ph.UserId AND ph.PostHistoryTypeId=1 AND ph.CreationDate>=to_timestamp('2010-09-14 11:59:07');"
val q5 = "SELECT COUNT(*) FROM comments as c, votes as v WHERE c.UserId = v.UserId AND c.Score=0;"
val q6 = "SELECT COUNT(*) FROM badges as b, posts as p WHERE b.UserId = p.OwnerUserId AND b.Date<=to_timestamp('2014-09-11 08:55:52') AND p.AnswerCount>=0 AND p.AnswerCount<=4 AND p.CommentCount>=0 AND p.CommentCount<=17;"
val q7 = "SELECT COUNT(*) FROM comments as c, posts as p, postLinks as pl WHERE c.UserId = p.OwnerUserId AND p.Id = pl.PostId AND p.CommentCount<=18 AND p.CreationDate>=to_timestamp('2010-07-23 07:27:31') AND p.CreationDate<=to_timestamp('2014-09-09 01:43:00');"
val q8 = "SELECT COUNT(*) FROM comments as c, posts as p, postLinks as pl WHERE c.UserId = p.OwnerUserId AND p.Id = pl.PostId AND c.Score=0 AND p.CreationDate>=to_timestamp('2010-09-06 00:58:21') AND p.CreationDate<=to_timestamp('2014-09-12 10:02:21') AND pl.LinkTypeId=1 AND pl.CreationDate>=to_timestamp('2011-07-09 22:35:44');"
val q9 = "SELECT COUNT(*) FROM comments as c, posts as p, postHistory as ph WHERE p.Id = c.PostId AND p.Id = ph.PostId AND p.CommentCount>=0 AND p.CommentCount<=25;"
val q10 = "SELECT COUNT(*) FROM comments as c, posts as p, users as u WHERE c.UserId = u.Id AND u.Id = p.OwnerUserId AND c.CreationDate>=to_timestamp('2010-08-05 00:36:02') AND c.CreationDate<=to_timestamp('2014-09-08 16:50:49') AND p.ViewCount>=0 AND p.ViewCount<=2897 AND p.CommentCount>=0 AND p.CommentCount<=16 AND p.FavoriteCount>=0 AND p.FavoriteCount<=10;"