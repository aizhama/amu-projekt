<#import "/spring.ftl" as spring/>

<html>
   <head>
      <title>Add Task</title>
      <link rel="stylesheet"
           type="text/css" href="<@spring.url '/css/style.css'/>"/>
   </head>
   <body>
      <#if errorMessage??>
      <div style="color:red;font-style:italic;">
         ${errorMessage}
      </div>
      </#if>

      <div>
         <fieldset>
            <legend>Add Task</legend>
            <form name="task" action="" method="POST">
               First Aufgabe: <@spring.formInput "taskForm.firstAufgabe" "" "text"/>    <br/>
               Second Aufgabe: <@spring.formInput "taskForm.secondAufgabe" "" "text"/>    <br/>
               <input type="submit" value="Create" />
            </form>
         </fieldset>
      </div>
   </body>
</html>