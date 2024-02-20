NO CREEIS LAS RAMAS EN GITHUB. 
IMPORTANTE!!!
LEEROS LAS BUENAS PRACTICAS Y HACER EL EJERCICIO TENIENDO EN CUENTA ESTO.
-----------------------------------------------------------------------------------
## Buenas prácticas para el trabajo colaborativo

Git puede llegar a ser complicado de trabajar en algunos casos, sobre todo a la hora de resolver conflictos entre diferentes integrantes de un grupo de trabajo. En este apartado vamos a hablar sobre buenas prácticas para evitar problemas cuando trabajamos dentro de un equipo.

Para empezar, los integrantes de un equipo deberían de evitar trabajar directamente con la rama principal de la aplicación (master o main). Es una mejor opción que cada integrante se cree una rama para hacer sus desarrollos (puede ser con su nombre, por ejemplo), y siempre intente trabajar con dicha rama.

Una vez tenga su desarrollo hecho o cuando estime oportuno, puede ir fusionando los cambios con la rama principal para luego subir estos cambios al repositorio remoto.

Podríamos resumirlo en los siguientes pasos:

0. Cada integrante se crea su repositorio local y lo sincroniza con el repositorio remoto.

1. Cada integrante del equipo se crea un propia rama local, para desarrollar sobre ella.

        git checkout -b tony_stark

2. Cada integrante comienza su trabajo de desarrollo, haciendo los commits que considere necesario

        git add .
        git commit -m "descripción del cambio"

3. Una vez hayamos acabado de hacer el desarrollo nos cambiamos a la rama master y nos bajamos los posibles cambios que hayan hecho nuestros compañeros.
    
        git checkout master
        git pull

4. Fusionamos la rama master con nuestra rama de desarrollo

        git merge tony_stark
    
5. Solucionamos los posibles conflictos (Si procede). Esto puede llevar a editar a mano ciertos ficheros y a crear nuevos commits con los cambios.

6. Subir los cambios al repositorio remoto

        git push origin master
    
7. Si queremos continuar con los desarrollos de nuestra rama, debemos de fusionar la rama master con la rama de desarrollo para que ambas ramas apunten al mismo commit. Esto solo es necesario si hemos hecho una fusión de tres vías, aunque no habría problema en hacerlo si es una fusión de avance rápido. Ver [Fusionando ramas en Git](#fusionando-ramas-en-git) para más información.

        git checkout tony_stark    
        git merge master
    
8. (Optativo). Podríamos subir nuestra rama de desarrollo a **origin** para que otros integrantes puedan verla o incluso trabajar con ella. 
    
        git push origin tony_stark

    Para bajarse la rama, los demás integrantes deberán ejecutar el siguiente comando

        git pull origin tony_stark

    Con el anterior comando nos bajaremos la rama, pero en nuestro git estará como **remota**, es decir, el nombre de la rama será **origin/tony_stark**, y hay es posible que no la veamos a simple visa, ya que por defecto el comando **git branch** solo muestra las ramas locales. Si queremos mostrar tanto las ramas locales como remotas debemos de ejecutar el siguiente comando

        git branch --all

    **Nota:** Todas las ramas que empiezan por **origin** son ramas remotas.

    Si queremos convertir una rama remota en una rama local para poder trabajar con ella, simplemente nos cambiaremos a ella y se nos creara dicha rama local

        git checkout tony_stark

    Podemos encontrar más información en el siguiente enlace [Trabajando con ramas remotas y locales](https://medium.com/@mario_gl/git-bajar-todas-las-nuevas-ramas-del-repositorio-remoto-ff02077a9251)
