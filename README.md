# design-pattern
Implementation des design patterns 

1. Design pattern de comportement
   
    * Chain of responsability
Le design pattern chain of responsability est un design pattern appartenant à la catégorie des designs patterns de comportement. Il permet de passer une requête à travers une chaîne d'objets (communément appelé handler), une fois la requête reçu, chaque objet décide soit de la traiter soit de la passer au prochain objet de la chaîne. L'objectif étant de faire en sorte que l'objet qui envoie la requête ne sache exactement pas quel objet (handler) traitera la requête, favorisant ainsi un couplage faible entre l'objet qui envoie et l'objet qui traite la requête.  
