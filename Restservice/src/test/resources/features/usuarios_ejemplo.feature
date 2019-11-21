# language: es

    Característica: obteniendo los usuarios por medio del servicio rest

    @Servicios
        Escenario: el actor de Scrrenplay quiere saber cuantos usarios tiene el servicio
        Dado el actor desea saber el nombre del usuraio tres
        Cuando consume el servicio Usarios
        Entonces verifica los datos correspondientes al servicio