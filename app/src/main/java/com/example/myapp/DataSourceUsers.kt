package com.example.myapp

class DataSource{

    companion object{

        fun createDataSet(): ArrayList<UserList>{
            val list = ArrayList<UserList>()
            list.add(
                UserList(
                    "Ramon Valdes",
                    "Pedido para las 12:00pm de hoy",
                    "Estado del pedido"

                )
            )
            list.add(
                UserList(
                    "Florinda Mesa",
                    "Pedido para las 11:00am de hoy",
                    "Estado del pedido"

                )
            )

            list.add(
                UserList(
                    "Pedro Barriga",
                    "Pedido para las 10:00am de hoy",
                    "Estado del pedido"

                )
            )
            list.add(
                UserList(
                    "Kiko Perez",
                    "Pedido para las 9:50am de hoy",
                    "Estado del pedido"

                )
            )
            list.add(
                UserList(
                    "Rodrigo Anaya",
                    "Pedido para las 9:00am de hoy",
                    "Estado del pedido"

                )
            )
            list.add(
                UserList(
                    "Pepito Suarez",
                    "Pedido para las 8:00am de hoy",
                    "Estado del pedido"

                )
            )

            return list
        }
    }
}