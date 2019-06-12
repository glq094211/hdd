INSERT INTO `user` (`user_id`,`user_name`,`name`,`password`,`salt`,`state`)
VALUES ('1', 'admin', '管理员', 'd3c59d25033dbf980d29554025c23a75', '8d78869f470951332959580424d4bf4f', 0);

INSERT INTO `sys_permission` (`permission_id`,`available`,`permission_name`,`parent_id`,`parent_ids`,`permission`,`resource_type`,`url`)
VALUES (1,0,'用户管理',0,'0/','user:view','menu','user/userList');
INSERT INTO `sys_permission` (`permission_id`,`available`,`permission_name`,`parent_id`,`parent_ids`,`permission`,`resource_type`,`url`)
VALUES (2,0,'用户添加',1,'0/1','user:add','button','user/userAdd');
INSERT INTO `sys_permission` (`permission_id`,`available`,`permission_name`,`parent_id`,`parent_ids`,`permission`,`resource_type`,`url`)
VALUES (3,0,'用户删除',1,'0/1','user:del','button','user/userDel');

INSERT INTO `sys_role` (`role_id`,`available`,`description`,`role`) VALUES (1,0,'管理员','admin');
INSERT INTO `sys_role` (`role_id`,`available`,`description`,`role`) VALUES (2,0,'VIP会员','vip');
INSERT INTO `sys_role` (`role_id`,`available`,`description`,`role`) VALUES (3,1,'test','test');

INSERT INTO `sys_role_permission` (`permission_id`,`role_id`) VALUES (1,1);
INSERT INTO `sys_role_permission` (`permission_id`,`role_id`) VALUES (2,1);
INSERT INTO `sys_role_permission` (`permission_id`,`role_id`) VALUES (3,2);

INSERT INTO `sys_user_role` (`role_id`,`user_id`) VALUES (1,1);