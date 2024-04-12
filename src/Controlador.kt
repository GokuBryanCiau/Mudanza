class Controlador {

    private val listaCliente = mutableListOf<Cliente>()

    val listaRepertidores = mutableListOf<Repertidor>()

    private val listaSolicitudes= mutableListOf<Solicitudes>()


    fun registrarSolicitudes() {

        println("Ingrese el Nombre del Cliente:")

        val nombre = readln()

        println("Ingresa el primer apellido:")

        val Primerapellido = readln()

        println("Ingrese el segundo apellido:")

        val  Segundoapellido = readln()

        println("Ingrese telefono :")

        val Telefono = readln().toLong()

        println("Ingresar el Domicilio")

        val Domicilio  = readln()

        val cliente = Cliente(nombre , Primerapellido, Segundoapellido, Telefono, Domicilio)

        listaCliente.add(cliente)

        println("¡Solicitud Registrada Exitosamente.!")
    }

        fun registrarRepertidor() {

            println("Ingrese el Nombre(s) del Repartidor: ")

            val Nombre = readln()

            println("Ingrese el Primer apellido: ")

            val Primerapellido = readln()

            println("Ingrese el Segundo Apellido: ")

            val Segundoapellido = readln()

            println("Ingrese su Número Telefonico: ")

            val Telefono = readln().toLong()

            println("Ingrese su RFC: ")

            val RFC = readln()

            println("Ingrese su Cargo en la Empresa: ")

            val Cargo = readln()

            val nuevoRepartidor = Repertidor(Nombre, Primerapellido, Segundoapellido, Telefono, RFC, Cargo)

            listaRepertidores.add(nuevoRepartidor)

            println("¡Repartidor Registrado Exitosamente!.")
        }

        fun mostrarSolicitudes() {

            if (listaSolicitudes.isEmpty()) {

                println("¡No hay Solicitudes Realizadas!.")
            } else {
                println("Lista de Solicitud Activa:") listaSolicitudes .forEach{ Solicitudes->
                    println("Nombre del Cliente de la Solicitud:......${Solicitudes.clienteSolicitud}")
                    println("Nombre del Repartidor:...................${Solicitudes.repartidor}")
                    println("Nombre del Destino:......................${Solicitudes.Direcciondestino}")
                    println("Fecha en que se Realizara la Mudanza:....${Solicitudes.fechaDeMudanza}")
                    println("Coste total de la Mudanza:...............${Solicitudes.costoMudanza}")
                }
            }
        }

        fun mostrarRepertidor() {

            if (listaRepertidores.isEmpty()) {

                println("¡No hay repartidores en el Sistema!.")
            } else {
                println("Lista de Repartidores:") listaRepartidores.forEach { repertidor ->
                    println("Nombre del Repartidor:...................${repertidor.nombre}")
                    println("Primer Nombre:...........................${repertidor.primerNombre}")
                    println("Segundo Nombre:..........................${repertidor.segundoNombre}")
                    println("Telefono del Repartidor:.................${repertidor.telefono}")
                    println("RFC del Repartidor:......................${repertidor.rfc}")
                    println("Cargo del Repartidor:....................${repertidor.cargo}")
                    println("ID de Repartidor:........................${repertidor.id}")
                }
            }
        }

        fun mostrarClientes() {

            if (listaCliente.isEmpty()) {
                println("¡No hay Clientes en el Sistema!.")
            } else {
                (println("Lista de Clientes Asociados:") listaCliente.forEach { cliente ->
                    println("Nombre del Cliente:......................${cliente.nombreCliente}")
                    println("Primer Apellido del Cliente:.............${cliente.primerApellido}")
                    println("Segundo Apellido del Cliente:............${cliente.segundoApellido}")
                    println("Direccion del Cliente:.................. ${cliente.direccion}")
                    println("Telefono del Cliente:....................${cliente.telefono}")
                }
            }
        }
    }