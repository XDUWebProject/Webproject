# 功能测试：
## 测试用例表：

![Alt text](https://github.com/XDUWebProject/Webproject/blob/master/Task8/task8.1.png)

![Alt text](https://github.com/XDUWebProject/Webproject/blob/master/Task8/task8.2.png)

# 性能测试：
## 1连接速度测试
### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;用户连接到Web应用系统的速度根据上网方式的变化而变化，他们或许是电话拨号，或是宽带上网。当下载一个程序时，用户可以等较长的时间，但如果仅仅访问一个页面就不会这样。如果Web系统响应时间太长（例如超过5秒），用户就会因没有耐心等待而离开。
### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;另外，有些页面有超时的限制，如果响应速度太慢，用户可能还没来得及浏览内容，就需要重新登陆了。而且，连接速度太慢，还可能引起数据丢失，使用户得不到真实的。
### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;西电新鲜事，由于体量较小并不存在连接速度太慢的问题。
## 2负载测试
### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;负载测试是为了测量Web系统在某一负载级别上的性能，以保证Web系统在需求范围内能正常工作。负载级别可以是某个时刻同时访问Web系统的用户数量，也可以是在线数据处理的数量。例如：Web应用系统能允许多少个用户同时在线？如果超过了这个数量，会出现什么现象？Web应用系统能否处理大量用户对同一个页面的请求？
### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;西电新鲜事，由于体量较小，就Tomcat的访问量来讲，250人的同时访问时应用运行状态正常，但是如果超过600人同时访问Tomcat则会崩溃。
## 3压力测试
### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;负载测试应该安排在Web系统发布以后，在实际的网络环境中进行测试。因为一个企业内部员工，特别是项目组人员总是有限的，而一个Web系统能同时处理的请求数量将远远超出这个限度，所以，只有放在Internet上，接受负载测试，其结果才是正确可信的。
### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;进行压力测试是指实际破坏一个Web应用系统，测试系统的反映。压力测试是测试系统的限制和故障恢复能力，也就是测试Web应用系统会不会崩溃，在什么情况下会崩溃。黑客常常提供错误的数据负载，直到Web应用系统崩溃，接着当系统重新启动时获得存取权。压力测试的区域包括表单、登陆和其他信息传输页面等。
### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;西电新鲜事由于体量较小，不考虑故障恢复问题，保证访问量不超过600即可。


## 安全性测试：
### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;（1）SQL注入（比如登陆页面）

### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;（2）XSS跨网站脚本攻击：程序或数据库没有对一些特殊字符进行过滤或处理，导致用户所输入的一些破坏性的脚本语句能够直接写进数据库中，浏览器会直接执行这些脚本语句，破坏网站的正常显示，或网站用户的信息被盗,构造脚本语句时，要保证脚本的完整性。

```javascript
document.write("abc")
<script>alter("abc")</script>
```
### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;（3）URL地址后面随便输入一些符号，并尽量是动态参数靠后

### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;（4）验证码更新问题

### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;（5）现在的Web应用系统基本采用先注册，后登陆的方式。因此，必须测试有效和无效的用户名和密码，要注意到是否大小写敏感，可以试多少次的限制，是否可以不登陆而直接浏览某个页面等。

### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;（6）Web应用系统是否有超时的限制，也就是说，用户登陆后在一定时间内（例如15分钟）没有点击任何页面，是否需要重新登陆才能正常使用。

### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;（7）为了保证Web应用系统的安全性，日志文件是至关重要的。需要测试相关信息是否写进了日志文件、是否可追踪。

### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;（8）当使用了安全套接字时，还要测试加密是否正确，检查信息的完整性。

### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;（9）服务器端的脚本常常构成安全漏洞，这些漏洞又常常被黑客利用。所以，还要测试没有经过授权，就不能在服务器端放置和编辑脚本的问题。

### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;（10）考虑到西电新鲜事性质，安全性不做过多考虑。只需要达到普通水平即可。


## webUI测试：
### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;1、风格、样式、颜色是否协调
### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;是
### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;2、界面布局是否整齐、协调（保证全部显示出来的，尽量不要使用滚动条
### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;是
### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;3、界面操作、标题描述是否恰当（描述有歧义、注意是否有错别字）
### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;是
### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;4、操作是否符合人们的常规习惯（有没有把相似的功能的控件放在一起，方便操作）
### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;是
### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;5、提示界面是否符合规范（不应该显示英文的cancel、ok，应该显示中文的确定等）
### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;是
### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;6、界面中各个控件是否对齐
### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;是
### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;7、日期控件是否可编辑
### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;无
### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;8、日期控件的长度是否合理，以修改时可以把时间全部显示出来为准
### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;无
### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;9、查询结果列表列宽是否合理、标签描述是否合理
### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;无
### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;10、查询结果列表太宽没有横向滚动提示
### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;无
### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;11、对于信息比较长的文本，文本框有没有提供自动竖直滚动条
### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;无
### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;12、数据录入控件是否方便
### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;是
### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;13、有没有支持Tab键，键的顺序要有条理，不乱跳
### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;支持
### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;14、有没有提供相关的热键
### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;无
### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;15、控件的提示语描述是否正确
### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;是
### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;16、模块调用是否统一，相同的模块是否调用同一个界面
### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;是
### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;17、用滚动条移动页面时，页面的控件是否显示正常
### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;无
### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;18、日期的正确格式应该是XXXX-XX-XX或XXXX-XX-XX XX:XX:XX
### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;无
### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;19、页面是否有多余按钮或标签
### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;无
### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;20、窗口标题或图标是否与菜单栏的统一
### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;是
### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;21、窗口的最大化、最小化是否能正确切换
### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;是
### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;22、对于正常的功能，用户可以不必阅读用户手册就能使用
### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;是
### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;23、执行风险操作时，有确认、删除等提示吗
### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;无
### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;24、操作顺序是否合理
### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;是
### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;25、正确性检查：检查页面上的form, button, table, header, footer,提示信息，还有其他文字拼写，句子的语法等是否正确。
### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;是
### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;26、系统应该在用户执行错误的操作之前提出警告，提示信息.
### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;无
### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;27、页面分辨率检查，在各种分辨率浏览系统检查系统界面友好性。
### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;兼容
### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;28、合理性检查：做delete, update, add, cancel, back等操作后，查看信息回到的页面是否合理。
### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;合理
### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;29、检查本地化是否通过：英文版不应该有中文信息，英文翻译准确，专业。
### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;无英文版

