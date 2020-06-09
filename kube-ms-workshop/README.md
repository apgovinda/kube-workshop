#Kubernetes  Yellow Pages Microservices
- There are two domains business and category maintained in separate gradle projects
- Both domains have their own controller, repository, Application and Database
- H2 Database being used for persistence
- Dockerfiles and Kubernetes Deployment files are added
- Both domains are deployed separately as two independent microservices
- Business Application makes a REST call to Category Application 