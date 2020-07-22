<#import "/spring.ftl" as spring/>
     <!-- See configuration in WebMvConfig.java -->
      <link th:href="@{/bootstrap/css/bootstrap.min.css}"
                rel="stylesheet" media="screen"/>

<!DOCTYPE HTML>
<html>
   <head>
      <meta charset="UTF-8" />
      <title>Welcome to AFC </title>
      <link rel="stylesheet"
           type="text/css" href="<@spring.url '/css/style.css'/>"/>
   </head>

   <body>
      <h1>Dashboard</h1>
      <#if message??>
      <h2>${message}</h2>
      </#if>

      <a href="<@spring.url '/taskList'/>">Task List</a>

   </body>

</html>