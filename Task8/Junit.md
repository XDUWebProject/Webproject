# 单元测试：
## 1.注册方法测试：
### 具体测试RegisterDaolmpl类的方法isRegister(Users users)
	@Test
		public void testIsRegiste() {
			Users a = new Users(3,"kangkang","123456","ha");
			Users b = new Users(4,"lankang","1236","haa");
			Users c = new Users(5,"zhang","456","haaa");
			isRegister(a);
			isRegister(b);
			isRegister(c);
		}

![Alt text](https://github.com/XDUWebProject/Webproject/blob/master/Task8/unit8.1.png)
### 测试结果正确;

## 2.用户登录方法测试：
### 具体测试UserDaolmpl类的方法isLogin(Users users)
	@Test
		public void testIsLogin() {
			Users a = new Users(3,"kangkang","123456","ha");
			Users b = new Users(4,"lankang","1236","haa");
			Users c = new Users(5,"zhang","456","haaa");
			isLogin(a);
			isLogin(b);
			isLogin(c);
}

![Alt text](https://github.com/XDUWebProject/Webproject/blob/master/Task8/unit8.2.png)
### 测试结果正确;

## 3.添加微博方法测试：
### 具体测试TopicDaolmpl类的方法insertTopic(Topic topic)
	@Test
		public void testInsertTopic() {
			List<Users> list = new ArrayList<Users>(3);
			Users a = new Users(3,"kangkang","123456","ha");
			Users b = new Users(4,"lankang","1236","haa");
			Users c = new Users(5,"zhang","456","haaa");
			list.add(a);
			list.add(b);
			list.add(c);
			Topic t = new  Topic(1, "hello", 3, 2, a, list) ;
			insertTopic(t);
		}

![Alt text](https://github.com/XDUWebProject/Webproject/blob/master/Task8/unit8.3.png)
### 测试结果正确;

## 4.删除自己发的微博方法测试：
### 具体测试DeletDaolmpl类的方法deleteTopic(int topicId)
@Test
		public void testDeleteTopic () {
			deleteTopic(23);
			deleteTopic(24);
			deleteTopic(25);
			deleteTopic(26);
			deleteTopic(27);
			deleteTopic(28);
		}

![Alt text](https://github.com/XDUWebProject/Webproject/blob/master/Task8/unit8.4.png)
### 测试结果正确;

## 5.点赞功能与点赞取消方法测试：
### 具体测试DianpraiseDaolmpl类的方法dianpraise(int useId, int topicId)
@Test
		public void testDianpraise () {
			dianpraise(2,19);
			dianpraise(1,21);
			dianpraise(1,22);
			dianpraise(1,23);
		}

![Alt text](https://github.com/XDUWebProject/Webproject/blob/master/Task8/unit8.5.png)
### 测试结果正确;

## 6.获取所有微博方法测试：
### 具体测试TopicListDao类的getMeAndAllFriendTopic()
	@Test
		public void testGetMeAndAllFriendTopic () {
			getMeAndAllFriendTopic();
		}

![Alt text](https://github.com/XDUWebProject/Webproject/blob/master/Task8/unit8.6.png)
### 测试结果正确;

## 7.获取赞的总数方法测试：
### 具体测试TopicListDao类的getPraiseCount(int topicId)
	@Test
		public void testGetPraiseCount() {
	  		getPraiseCount(24);
		}

![Alt text](https://github.com/XDUWebProject/Webproject/blob/master/Task8/unit8.7.png)
### 测试结果正确;

## 7.获取所有点赞人的名字：
### 具体测试TopicListDao类的getPraisePeopleName(int topicId)
	@Test
		public void testGetPraisePeopleName() {
			getPraisePeopleName(24);
		}

![Alt text](https://github.com/XDUWebProject/Webproject/blob/master/Task8/unit8.8.png)
### 测试结果正确;
