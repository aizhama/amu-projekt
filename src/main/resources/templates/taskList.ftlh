  <#import "/spring.ftl" as spring/>

  <html>
     <head>
        <title>Task List</title>
        <link rel="stylesheet"
             type="text/css"
             href="<@spring.url '/css/style.css'/>"/>
     </head>
     <body>
       <h3>Task List</h3>
       <a href="addTask">Add Task</a>
       <br><br>

        <div>
           <table border="1">
              <tr>
                 <th>First Aufgabe</th>
                 <th>Second Aufgabe</th>
              </tr>
              <#list task as task>
              <tr>
                 <td>${task.firstAufgabe}</td>
                 <td>${task.secondAufgabe}</td>
              </tr>
              </#list>
           </table>
        </div>


     </body>
  </html>
