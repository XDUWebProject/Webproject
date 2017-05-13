# 1 功能概要:
### <1.1> 注册，登陆
### <1.2> 主页面显示所有微博信息(查)
### <1.3> 发微博(增)
### <1.4> 点赞，取消点赞(改)
### <1.5> 删除
### <1.6> 建表，连接数据库
### <1.7> 好友关系(附加，选择完成)

# 2 实现原理:
### - 应用技术：JSP+Servlet+Mysql
Servlet是Java提供的用于开发Web服务器应用程序的一个组件，运行在服务器端，由Servlet容器所管理，用于生成动态的内容。Servlet是平台独立的Java类，编写一个Servlet，实际上就是按照Servlet规范编写一个Java类。Java提供一系列接口类（所谓接口类就是类中所有方法只提供方法声明，不提供任何的方法实现，这些类的实现就留给后继者去做。

Servlet、ServletConfig、Serializable，然后通过多重继承产生一个最通用的Servlet实现类，接下来，通过一个多重继承与实现，产生一个新的实现类HttpServlet，用户在开发Servlet程序时只需继承这个类，从而产生一个自己的类，然后根据实际开发功能与信息处理需要，去实现该类中的相关方法即可。 这就是前面提到的按照Servlet规范编写一个Java类，从而编写一个Servlet。

至于JSP（JavaServlet Page）,实际上它也是从Servlet继承而来。只不过它在Servlet当中又添加/修改了一些方法，作了新的封装。具体到Tomcat Web应用服务器中，它通过一个多重继承，分别从Java的HttpJspPage和HttpServlet两个类那里继承和实现一些方法，然后封装一个叫做HttpJspBase的类从而实现了一个通用化的JSP类，用户在开发自己的JSP时，只需要从HttpJspBase继承一个自己的类，然后根据需要去实现相应的方法即可。

使用Servlet产生动态网页，需要在代码中打印输出很多HTML的标签，此外，在Servlet中，我们不得不将静态现实的内容和动态产生内容的代码混合在一起。使用Servlet开发动态网页，程序员和网页编辑人员将无法一起工作，因为网页编辑人员不了解Java语言，无法修改Servlet代码，而Java程序员可能也不是很了解网页编辑人员的意图，以至于无法修改和实现网页功能。为了解决这些问题，Sun公司就推出了JSP技术。JSP是Servlet的扩展，在没有JSP之前，就已经出现了Servlet技术。Servlet是利用输出流动态生成HTML页面，包括每一个HTML标签和每个在HTML页面中出现的内容。
         
JSP通过在标准的HTML页面中插入Java代码，其静态的部分无须Java程序控制，只有那些需要从数据库读取并根据程序动态生成信息时，才使用Java脚本控制。事实上，JSP是Servlet的一种特殊形式，每个JSP页面就是一个Servlet实例——JSP页面由系统编译成Servlet，Servlet再负责响应用户请求。JSP其实也是Servlet的一种简化，使用JSP时，其实还是使用Servlet，因为Web应用中的每个JSP页面都会由Servlet容器生成对应的Servlet。对于Tomcat而言，JSP页面生成的Servlet放在work路径对应的Web应用下。
### - Servlet与表单交互的方法
Servlet使用HttpServlet类中的方法与表单进行交互。在HttpServlet类中有几个未完全实现的方法，你可以自己定义方法的内容，但是必须正确使用方法名称以使HTTP Server把客户请求正确的映射到相应的函数上。

　　doHeader 用于处理HEADER请求
  
    doGet 用于处理GET请求，也可以自动的支持HEADER请求
    
　　doPost 用于处理POST请求
  
　　doPut 用于处理PUT请求
  
    doDelete 用于处理DELETE请求


在使用这些方法时必须带两个参数。第一个包含来自客户端的数据HttpServletRequest。第二个参数包含客户端的相应HttpServletResponse。


一个HttpServletRequest对象提供请求HTTP头部数据，也允许获取客户端的数据。怎样获取这些数据取决于HTTP请求方法。不管何种HTTP方式，都可以用getParameterValues方法返回特定名称的参数值。HttpServletRequest,HttpServletResponse接口分别继承于ServletRequest和ServletResponse接口，getParameterValues和getWriter方法都是其祖先接口中的方法。

对于HTTP GET请求的方式，getQueryString方法将会返回一个可以用来解剖分析的参数值。对于用HTTP POST，PUT和DELETE请求的方式，HttpServletRequest有两种方法可以选择：如果是文本数据，你能通过getReader的方法得到BufferedReader获取数据；如果是二进制数据，可以通过getInputStream方法得到ServletInputStream获取数据。
    
为了相应客户端，一个HttpServletResponse对象提供返回数据给用户的两个方法：一种是用getWriter方法得到一个PrintWriter，用于返回文本数据；另一种方法是用getOutputStream方法得到ServletOutputStream，用于返回二进制数据。在使用Writer或OutputStream之前应先设置头部（HttpServletResponse中有相应的方法），然后用Writer或OutputStream将相应的主体部分发给用户。完成后要关闭Writer或OutputStream以便让服务器知道相应已经结束。
在进行HTTP网络传输的时候，统一采用的编码方式是ISO-8859-1
字符编码转换常用的方法是

　　String native_encoded = "中文字符串"; //本地编码的字符串　　
    Byte[] byte_array = native_encoded.getBytes(); //得到本地编码的字节数组
　　String net_encoded = new String(native_encoded, "ISO-8859-1"); //生成ISO-8859-1编码的字符串
  
例：out.println(new String(new String("<td>你的姓名：</td>").getBytes(),"ISO-8859-1"));

用Servlet控制会话：

会话状态的维持是开发Web应用所必须面对的问题，有多种方法可以来解决这个问题，如使用Cookies，或直接把状态信息加到URL中等，还有Servlet本身提供了一个HttpSession接口来支持会话状态的维持 。Session的发明是为了填补HTTP协议的局限。

从服务器这端来看，每一个请求都是独立的，因此HTTP协议被认为是无状态协议，当用户在多个主页间切换时，服务器无法知道他的身份。Session的出现就是为了弥补这个局限。利用Session，您就可以当一个用户在多个主页间切换的时候也能保存他的信息。这样很多以前根本无法去做的事情就变得简单多了。

在访问者从到达某个特定的主页到离开为止的那段时间，每个访问者都会单独获得一个Session
    
Java Servlet定义了一个HttpSession接口，实现的Session的功能，在Servlet中使用Session的过程如下：

　　（1） 使用HttpServletRequest的getSession方法得到当前存在的session，如果当前没有定义session，则创建一个新的session，还可以使用方法getSession（true）
  
　　（2） 写session变量。可以使用方法HttpSession.setAttribute（name，value）来向Session中存储一个信息。
  
　　（3） 读Session变量。可以使用方法HttpSession.getAttribute（name）来读取Session中的一个变量值，如果name是一个没有定义的变量，那么返回的是null。需要注意的是，从getAttribute读出的变量类型是Object，必须使用强制类型转换，比如：String uid = (String) session.getAttribute("uid");
  
　　（4） 关闭session，当时用完session后，可以使用session.invalidate()方法关闭session。但是这并不是严格要求的。因为，Servlet引擎在一段时间之后，自动关闭seesion。
  
      HttpSession session = request.getSession(true); //参数true是指在没有session时创建一个新的
　　　Date created = new Date(session.getCreationTime()); //得到session对象创建的时间
　　　out.println("ID " + session.getId()+"<br>"); //得到该session的id，并打印
　　　out.println("Created: " + created+"<br>");//打印session创建时间
　　　session.setAttribute("UID","12345678"); //在session中添加变量UID=12345678
　　　session.setAttribute("Name","Tom"); //在session中添加变量Name=Tom 　10.2.4 Servlet的生命周期
   
跟客户端的Applet相似，Servlet也遵循严格的生命周期。在每个Servlet实例的生命中有三种类型的事件，这三种事件分别对应于由Servlet引擎所唤醒的三个方法：

　　1．init()。当Servlet第一次被装载时，Servlet引擎调用这个Servlet的init()方法，只调用一次。系统保证，在init方法成功完成以前，是不会调用Servlet去处理任何请求的。
  
　　2．service()。这是Servlet最重要的方法，是真正处理请求的地方。对于每个请求，Servlet引擎将调用Servlet的service方法，并把Servlet请求对象和Servlet响应对象作为参数传递给它。
  
　　3．destroy()。这是相对于init的可选方法，当Servlet即将被卸载时由Servlet引擎来调用，这个方法用来清除并释放在init方法中所分配的资源。 
Servlet的生命周期可以被归纳为以下几步：

　　（1） 装载Servlet，这一项操作一般是动态执行的。然而，Servlet通常会提供一个管理的选项，用于在Servlet启动时强制装载和初始化特定的Servlet
  
　　（2） Server创建一个Servlet实例
  
　　（3） Server调用Servlet的init方法
  
　　（4） 一个客户端请求到达Server
  
　　（5） Server创建一个请求对象
  
　　（6） Server创建一个响应对象
  
　　（7） Server激活Servlet的service方法，传递请求和响应对象作为参数
  
　　（8） service方法获得关于请求对象的信息，处理请求，访问其他资源，获得需要的信息
  
　　（9） service方法使用响应对象的方法。将响应传回Server，最终到达客户端。Service方法可能激活其他方法以处理请求。如doGet，doPost或其他程序员自己开发的方法
  
　　（10） 对于更多的客户端请求，Server创建新的请求和响应对象，仍然激活此servlet的service方法，将这两个对象作为参数传递给它，如此重复以上的循环，但无需再次调用init方法，Servlet一般只初始化一次
  
　　（11） 当Server不再需要Servlet时，比如当Server要关闭时，Server调用Servlet的destroy
  
### - JSP一般运行方式：
当服务器启动后，当Web浏览器端发送过来一个页面请求时，Web服务器先判断是否是JSP页面请求。如果该页面只是一般的HTML/XML页面请求，则直接将HTML/XML页面代码传给Web浏览器端。如果请求的页面是JSP页面，则由JSP引擎检查该JSP页面，如果该页面是第一次被请求、或不是第一次被请求但已被修改，则JSP引擎将此JSP页面代码转换成Servlet代码，然后JSP引擎调用服务器端的Java编译器javac.exe对Servlet代码进行编译，把它变成字节码(.class)文件，然后再调用JAVA虚拟机执行该字节码文件，然后将执行结果传给Web浏览器端。如果该JSP页面不是第一次被请求，且没有被修改过，则直接由JSP引擎调用JAVA虚拟机执行已编译过的字节码.class文件，然后将结果传送Web浏览器端。
采用JSP来表现页面，采用Servlet来完成大量的处理，Servlet扮演一个控制者的角色，并负责响应客户请求。Servlet创建JSP需要的Bean和对象，根据用户的行为，决定将哪个JSP页面发送给用户。特别要注意的是，JSP页面中没有任何商业处理逻辑，它只是简单的检索Servlet先前创建的Beans或者对象，再将动态内容插入预定义的模板。

# 3 安装部署及相关配置:
### - Tomcat服务器安装部署：
1.下载：

到Apache的官方网站，我们可以很容易找到Tomcat的下载地址，如：
http://tomcat.apache.org/download-60.cgi 在这里我们可以下载到Tomcat最新的zip、tar.gz和Windows Service Installer三种安装包，其中：
Zip是Windows下的免安装版本，只需要解压后做一定的手动配置就可以正常的使用；
tar.gz是Linux下的安装包；
Windows Service Installer很明显就是Windows下的Install程序，双击后就可以自动安装了。

2.解压与配置：

在安装Tomcat之前，我们首先要安装的是JDK，Tomcat是在Java运行环境的支持下运行的，所以必须首先安装并配置好JDK。JDK的安装程序可以到sun公司的官方网站，在这里我们就详细描述JDK的安装了。
JDK安装好后需要配置以下环境变量：
JAVA_HOME=JDK安装目录
ClassPath=%JAVA_HOME%\bin
Path=%JAVA_HOME%\bin;原有内容
将apache-tomcat-8.0.28.zip解压到D:\Program File\tomcat8文件夹中，这里就是我们的Tomcat了。
解压后Tomcat以后我们同样需要设置几个环境变量：
CATALINA_HOME=Tomcat解压目录，我们这里就是CATALINA_HOME=D:\Program File\tomcat8
ClassPath=%CATALINA_HOME%\bin;
原有内容环境变量配置的时候如果没有这个关键字，就新加一项，如果已经有了，如Path，就是在原有内容值的基础上添加新的内容，新的内容与原有的值以分号相隔。
配置好上面的这些内容以后就可以重启系统了。

3.运行：

重启系统以后，我们可以进入Tomcat解压目录下的bin目录，找到startup.bat文件，这个文件就是Tomcat的启动文件，双击这个文件，我们可以看到打开了一个命令行窗口，一些Tomcat启动的加载信息就显示出来，最后一行应该是:

信息：Server startup in xxx ms

这就是说你的服务器已经启动成功了，这是你可以打开浏览器，在地址栏中输入：

http://localhost:8080

就可以看到Tomcat的页面了。

为了启动方便，我们可以将这个startup.bat文件创建一个快捷方式到桌面上，以后就可以直接使用这个快捷方式了。
需要特别注意的是，这种方式启动的Tomcat会有一个命令行窗口停留在你的面前，这就是启动着的服务器，千万不要将它关闭，如果把这个窗口关闭了，你的Tomcat服务器也就关闭了，切记，切记。

在这里，我们配置的时候并没有修改默认的Tomcat服务器端口，所以就是8080。如果想修改这个端口，可以到tomcat安装目录的conf目录下，找到server.xml这个配置文件，一种
有这么一段：

< protocol="HTTP/1.1"port="8080" connectionTimeout="20000" redirectPort="8443" />
这里面的port=”8080”就是服务器启动时的端口，你可以将这里修改成你想设置的端口，但注意不要与其它的软件所使用的端口冲突，一旦发生了端口冲突，Tomcat就无法启动了。

我们还可以在这个配置文件中配置自己的虚拟目录，找到下面这组代码：

<Host name="localhost" appBase="webapps" unpackWARs="true" xmlValidation="false" xmlNamespaceAware="false">
<Context path="/test" docBase="D:test" reloadable="true" />
</Host>

虚拟目录的配置信息就是写在server.xml配置文件的这对标签之间，配置代码中的path是用来在浏览器中访问时使用的虚拟目录的路径 名，如上面我们配置的信息path值是”/test”，这个值中的反斜杠”/”是必不可少的，配置了这个值以后，我们在浏览器中访问这个虚拟目录的地址路 径如下：
http://localhost:8080/test

另一个参数docBase是虚拟目录实际的存放地址，上面的配置示例就是把D:test目录配置成了名称为test的虚拟目录。

4.安装服务：

如此配置的Tomcat每次都需要手动启动，如果你想让这个Tomcat服务器在系统已启动的时候就自动启动，我们可以将其注册成系统的服务，注册方式如下：
  在运行中执行cmd打开命令行窗口，转入Tomcat解压目录的Bin目录下，在这里我们转到的就是D:\Program File\tomcat8\bin，然后执行以下命令：service.bat install,这样就会将
tomcat8.exe文件注册成系统的服务。
我们在运行services.msc，打开系统的服务查看，是不是多出来了一个”Apache Tomcat”服务？但这个服务的启动类型是手动的，我们可以将其修改为自动，那样Tomcat服务器就会随着系统的启动而自动启动了。
  如果不想要这个服务了，可以在命令行窗口中D:\Program File\tomcat8\bin下执行：
    service.bat remove就可以移除此服务。
    
5.JVM配置内存：

将D:\Program File\tomcat8\bin中的service.bat文件的JvmMs值改为256，JvmMx的值改为512；

6.Tomcat添加用户：

在D:\Program File\tomcat8\conf文件的tomcat-user.xml中添加“<user username="" password="" roles="manager-gui"></user>” 

# 4 遗留问题:
### <1.1> 由于各成员所用JDK版本不同，开发工具版本不同，导致项目不兼容
