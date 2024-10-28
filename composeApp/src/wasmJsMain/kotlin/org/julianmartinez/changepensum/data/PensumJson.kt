package org.julianmartinez.changepensum.data

val actualPensum = """
    {
      "creditos": 164,
      "materias": [
        {
          "codigo": "5201",
          "nombre": "Fundamentos de Programación",
          "creditos": 4,
          "teoria": 64,
          "practica": 192,
          "semestre": 1
        },
        {
          "codigo": "5801",
          "nombre": "Diseño Asistido por Computador",
          "creditos": 3,
          "teoria": 0,
          "practica": 144,
          "semestre": 1
        },
        {
          "codigo": "5001",
          "nombre": "Cálculo Diferencial",
          "creditos": 4,
          "teoria": 64,
          "practica": 192,
          "semestre": 1
        },
        {
          "codigo": "5005",
          "nombre": "Álgebra Superior",
          "creditos": 2,
          "teoria": 32,
          "practica": 96,
          "semestre": 1
        },
        {
          "codigo": "9001",
          "nombre": "Introducción a la Ingeniería",
          "creditos": 2,
          "teoria": 32,
          "practica": 96,
          "semestre": 1
        },
        
        {
          "codigo": "5202",
          "nombre": "Programación 1",
          "creditos": 4,
          "teoria": 64,
          "practica": 192,
          "semestre": 2
        },
        {
          "codigo": "5002",
          "nombre": "Cálculo Integral",
          "creditos": 4,
          "teoria": 64,
          "practica": 192,
          "semestre": 2
        },
        {
          "codigo": "5006",
          "nombre": "Álgebra Lineal",
          "creditos": 2,
          "teoria": 32,
          "practica": 96,
          "semestre": 2
        },
        {
          "codigo": "6101",
          "nombre": "Proyecto integrador 1",
          "creditos": 2,
          "teoria": 64,
          "practica": 144,
          "semestre": 2
        },
        {
          "codigo": "9101",
          "nombre": "Expresión 1",
          "creditos": 4,
          "teoria": 32,
          "practica": 96,
          "semestre": 2
        },


        {
          "codigo": "5203",
          "nombre": "Estructura de Datos",
          "creditos": 4,
          "teoria": 64,
          "practica": 192,
          "semestre": 3
        },
        {
          "codigo": "5003",
          "nombre": "Cálculo en Varias Variables",
          "creditos": 3,
          "teoria": 64,
          "practica": 192,
          "semestre": 3
        },
        {
          "codigo": "5101",
          "nombre": "Quimica General",
          "creditos": 3,
          "teoria": 64,
          "practica": 144,
          "semestre": 3
        },
        {
          "codigo": "5105",
          "nombre": "Mecánica",
          "creditos": 4,
          "teoria": 64,
          "practica": 144,
          "semestre": 3
        },
        {
          "codigo": "6102",
          "nombre": "Proyecto integrador 2",
          "creditos": 1,
          "teoria": 64,
          "practica": 144,
          "semestre": 3
        },
        
        
        {
          "codigo": "5204",
          "nombre": "Base de Datos",
          "creditos": 4,
          "teoria": 64,
          "practica": 192,
          "semestre": 4
        },
        {
          "codigo": "5301",
          "nombre": "Matemáticas Discretas",
          "creditos": 4,
          "teoria": 64,
          "practica": 192,
          "semestre": 4
        },
        {
          "codigo": "5004",
          "nombre": "Ecuaciones Diferenciales",
          "creditos": 3,
          "teoria": 48,
          "practica": 144,
          "semestre": 4
        },
        {
          "codigo": "5106",
          "nombre": "Electromagnetismo",
          "creditos": 4,
          "teoria": 64,
          "practica": 144,
          "semestre": 4
        },
        {
          "codigo": "6103",
          "nombre": "Proyecto integrador 3",
          "creditos": 1,
          "teoria": 64,
          "practica": 144,
          "semestre": 4
        },
        {
          "codigo": "9002",
          "nombre": "Identidad y Cultura Ciudadana", 
          "creditos": 2,
          "teoria": 64,
          "practica": 144,
          "semestre": 4
        },
        
        
        {
          "codigo": "2401",
          "nombre": "Administración y Gestión de Base de Datos",
          "creditos": 3,
          "teoria": 64,
          "practica": 192,
          "semestre": 5
        },
        {
          "codigo": "5205",
          "nombre": "Análisis de Algoritmos",
          "creditos": 4,
          "teoria": 64,
          "practica": 192,
          "semestre": 5
        },
        {
          "codigo": "5102",
          "nombre": "Biología General",
          "creditos": 3,
          "teoria": 48,
          "practica": 144,
          "semestre": 5
        },
        {
          "codigo": "5107",
          "nombre": "Ondas y Partículas",
          "creditos": 4,
          "teoria": 48,
          "practica": 144,
          "semestre": 5
        },
        {
          "codigo": "6104",
          "nombre": "Proyecto integrador 4",
          "creditos": 1,
          "teoria": 64,
          "practica": 144,
          "semestre": 5
        },
        {
          "codigo": "9102",
          "nombre": "Expresión 2",
          "creditos": 2,
          "teoria": 64,
          "practica": 144,
          "semestre": 5
        },
        
        
        {
          "codigo": "2402",
          "nombre": "Modelado de Sistemas de Información",
          "creditos": 2,
          "teoria": 64,
          "practica": 192,
          "semestre": 6
        },
        {
          "codigo": "2501",
          "nombre": "Teoria de Sistemas",
          "creditos": 2,
          "teoria": 64,
          "practica": 192,
          "semestre": 6
        },{
          "codigo": "2601",
          "nombre": "Arquitectura de Computadores",
          "creditos": 3,
          "teoria": 64,
          "practica": 192,
          "semestre": 6
        },
         {
          "codigo": "5206",
          "nombre": "Programación 2",
          "creditos": 3,
          "teoria": 64,
          "practica": 144,
          "semestre": 6
        },
        {
          "codigo": "5302",
          "nombre": "Modelado y Análisis Numérico",
          "creditos": 4,
          "teoria": 64,
          "practica": 192,
          "semestre": 6
        },
        {
          "codigo": "6105",
          "nombre": "Formulación de Proyectos",
          "creditos": 3,
          "teoria": 48,
          "practica": 144,
          "semestre": 6
        },
       
        
        
        
        {
          "codigo": "2403",
          "nombre": "Ingeniería de Software",
          "creditos": 4,
          "teoria": 48,
          "practica": 144,
          "semestre": 7
        },
        {
          "codigo": "2502",
          "nombre": "Sistemas Dinámicos",
          "creditos": 3,
          "teoria": 48,
          "practica": 144,
          "semestre": 7
        },
        {
          "codigo": "2602",
          "nombre": "Sistemas Operativos",
          "creditos": 3,
          "teoria": 48,
          "practica": 144,
          "semestre": 7
        },
        {
          "codigo": "5303",
          "nombre": "Probabilidad y Estadística",
          "creditos": 3,
          "teoria": 48,
          "practica": 144,
          "semestre": 7
        },
        {
          "codigo": "6106",
          "nombre": "Evalución de Proyectos",
          "creditos": 3,
          "teoria": 64,
          "practica": 192,
          "semestre": 7
        },
        
        
        
        {
          "codigo": "2404",
          "nombre": "Arquitectura de Software",
          "creditos": 3,
          "teoria": 48,
          "practica": 144,
          "semestre": 8
        },
        {
          "codigo": "2701",
          "nombre": "Comunicación de Datos",
          "creditos": 4,
          "teoria": 48,
          "practica": 144,
          "semestre": 8
        },
        {
          "codigo": "2901",
          "nombre": "Electiva Profesional 1",
          "creditos": 3,
          "teoria": 48,
          "practica": 144,
          "semestre": 8
        },
        {
          "codigo": "5304",
          "nombre": "Investigación de Operaciones 1",
          "creditos": 4,
          "teoria": 64,
          "practica": 192,
          "semestre": 8
        },
        {
          "codigo": "6201",
          "nombre": "Electiva Complementaria 1",
          "creditos": 3,
          "teoria": 64,
          "practica": 192,
          "semestre": 8
        },
        
        {
          "codigo": "2405",
          "nombre": "Gestión de Proyectos de T.I.",
          "creditos": 2,
          "teoria": 48,
          "practica": 144,
          "semestre": 9
        },
        {
          "codigo": "2702",
          "nombre": "Redes de Comunicación",
          "creditos": 4,
          "teoria": 48,
          "practica": 144,
          "semestre": 9
        },        
        {
          "codigo": "2802",
          "nombre": "Trabajo de Grado 1",
          "creditos": 2,
          "teoria": 48,
          "practica": 144,
          "semestre": 9
        },
        {
          "codigo": "2902",
          "nombre": "Electiva Profesional 2",
          "creditos": 3,
          "teoria": 48,
          "practica": 144,
          "semestre": 9
        },
        {
          "codigo": "5305",
          "nombre": "Investigación de Operaciones 2",
          "creditos": 3,
          "teoria": 64,
          "practica": 192,
          "semestre": 9
        },
         {
          "codigo": "5901",
          "nombre": "Electiva de Ingeniería 1",
          "creditos": 3,
          "teoria": 64,
          "practica": 192,
          "semestre": 9
        },
        
        
        {
          "codigo": "2803",
          "nombre": "Trabajo de Grado 2",
          "creditos": 6,
          "teoria": 48,
          "practica": 144,
          "semestre": 10
        },
        {
          "codigo": "2903",
          "nombre": "Electiva Profesional 3",
          "creditos": 3,
          "teoria": 48,
          "practica": 144,
          "semestre": 10
        },
        {
          "codigo": "5902",
          "nombre": "Electiva de Ingeniería 2",
          "creditos": 3,
          "teoria": 64,
          "practica": 192,
          "semestre": 10
        },
        {
          "codigo": "6202",
          "nombre": "Electiva Complementaria 2",
          "creditos": 2,
          "teoria": 64,
          "practica": 192,
          "semestre": 10
        },
        {
          "codigo": "9003",
          "nombre": "Ética y Compromiso Profesional",
          "creditos": 2,
          "teoria": 64,
          "practica": 192,
          "semestre": 10
        }
      ]
    }
""".trimIndent()


val newPensum = """
    {
      "creditos": 132,
      "materias": [
        {
            "codigo": "0",
            "nombre": "Cálculo Diferencial",
            "creditos": 4,
            "semestre": 1
        },
        {
            "codigo": "1",
            "nombre": "Fundamentos de Programación",
            "creditos": 3,
            "semestre": 1
        },
        {
            "codigo": "2",
            "nombre": "Álgebra",
            "creditos": 2,
            "semestre": 1
        },
        {
            "codigo": "3",
            "nombre": "Diseño y Prototipado",
            "creditos": 3,
            "semestre": 1
        },
        {
            "codigo": "4",
            "nombre": "Mecánica",
            "creditos": 3,
            "semestre": 1
        },
        {
            "codigo": "5",
            "nombre": "Expressión 1",
            "creditos": 2,
            "semestre": 1
        },
        {
            "codigo": "6",
            "nombre": "Matematicas Discretas",
            "creditos": 3,
            "semestre": 2
        },
        {
            "codigo": "7",
            "nombre": "Programación 1",
            "creditos": 3,
            "semestre": 2
        },
        {
            "codigo": "8",
            "nombre": "Calculo Integral",
            "creditos": 4,
            "semestre": 2
        },
        {
            "codigo": "9",
            "nombre": "Electromagnetismo",
            "creditos": 3,
            "semestre": 2
        },
        {
            "codigo": "10",
            "nombre": "Proyecto Integrador 1",
            "creditos": 2,
            "semestre": 2
        },
        {
            "codigo": "11",
            "nombre": "Expressión 2",
            "creditos": 2,
            "semestre": 2
        },
        {
            "codigo": "12",
            "nombre": "Hardware y Sistema Operativo",
            "creditos": 3,
            "semestre": 3
        },
        {
            "codigo": "13",
            "nombre": "Estructura de Datos",
            "creditos": 4,
            "semestre": 3
        },
        {
            "codigo": "14",
            "nombre": "Calculo en Varias Variables",
            "creditos": 3,
            "semestre": 3
        },
        {
            "codigo": "15",
            "nombre": "Modelado y Análisis Numérico",
            "creditos": 3,
            "semestre": 3
        },
        {
            "codigo": "16",
            "nombre": "Sistemas Bióticos",
            "creditos": 3,
            "semestre": 3
        },
        {
            "codigo": "17",
            "nombre": "Proyecto Integrador 2",
            "creditos": 1,
            "semestre": 3
        },
        {
            "codigo": "18",
            "nombre": "Ciudadanía",
            "creditos": 2,
            "semestre": 3
        },
        {
            "codigo": "19",
            "nombre": "Pensamiento Sistemico",
            "creditos": 2,
            "semestre": 4
        },
        {
            "codigo": "20",
            "nombre": "Redes",
            "creditos": 3,
            "semestre": 4
        },
        {
            "codigo": "21",
            "nombre": "Análisis de Algoritmos",
            "creditos": 3,
            "semestre": 4
        },
        {
            "codigo": "22",
            "nombre": "Bases de Datos",
            "creditos": 3,
            "semestre": 4
        },
        {
            "codigo": "23",
            "nombre": "Programación 2",
            "creditos": 3,
            "semestre": 4
        },
        {
            "codigo": "24",
            "nombre": "Ecuaciones Diferenciales",
            "creditos": 3,
            "semestre": 4
        },
        {
            "codigo": "25",
            "nombre": "Proyecto Integrador 3",
            "creditos": 1,
            "semestre": 4
        },
        {
            "codigo": "26",
            "nombre": "Modelado de Sistemas de Información",
            "creditos": 2,
            "semestre": 5
        },
        {
            "codigo": "27",
            "nombre": "Administración y Gestión de Base de Datos",
            "creditos": 3,
            "semestre": 5
        },
        {
            "codigo": "28",
            "nombre": "Desarrollo de Web",
            "creditos": 3,
            "semestre": 5
        },
        {
            "codigo": "29",
            "nombre": "Electiva Disciplinar 1",
            "creditos": 3,
            "semestre": 5
        },
        {
            "codigo": "30",
            "nombre": "Probabilidad y Estadística",
            "creditos": 3,
            "semestre": 5
        },
        {
            "codigo": "31",
            "nombre": "Proyecto Integrador 4",
            "creditos": 1,
            "semestre": 5
        },
        {
            "codigo": "32",
            "nombre": "Electiva Complementaria",
            "creditos": 2,
            "semestre": 5
        },
        {
            "codigo": "33",
            "nombre": "Ingeniería de Software",
            "creditos": 3,
            "semestre": 6
        },
        {
            "codigo": "34",
            "nombre": "Seguridad Informática",
            "creditos": 3,
            "semestre": 6
        },
        {
            "codigo": "35",
            "nombre": "Electiva Disciplinar 2",
            "creditos": 3,
            "semestre": 6
        },
        {
            "codigo": "36",
            "nombre": "Inteligencia Artificial",
            "creditos": 3,
            "semestre": 6
        },
        {
            "codigo": "37",
            "nombre": "Formulación y Evaluación de Proyectos",
            "creditos": 3,
            "semestre": 6
        },
        {
            "codigo": "38",
            "nombre": "Etica y Compromiso Profesional",
            "creditos": 2,
            "semestre": 6
        },
        {
            "codigo": "39",
            "nombre": "Arquitectura de Software",
            "creditos": 3,
            "semestre": 7
        },
        {
            "codigo": "40",
            "nombre": "Administracion de Servidores",
            "creditos": 3,
            "semestre": 7
        },
        {
            "codigo": "41",
            "nombre": "Ciencia de Datos",
            "creditos": 3,
            "semestre": 7
        },
        {
            "codigo": "42",
            "nombre": "Tecnologias Emergentes de Desarrollo",
            "creditos": 2,
            "semestre": 7
        },
        {
            "codigo": "43",
            "nombre": "Investigación de Operaciones",
            "creditos": 3,
            "semestre": 7
        },
        {
            "codigo": "44",
            "nombre": "Professional Communication Techniques for Engineers",
            "creditos": 2,
            "semestre": 7
        },
        {
            "codigo": "45",
            "nombre": "Gestion de Proyectos de T.I.",
            "creditos": 2,
            "semestre": 7
        },
        {
            "codigo": "46",
            "nombre": "Modalidad de Grado",
            "creditos": 8,
            "semestre": 8
        },
        {
            "codigo": "47",
            "nombre": "Electiva Disciplinar 3",
            "creditos": 3,
            "semestre": 8
        },
        {
            "codigo": "48",
            "nombre": "Electiva de Ingeniería",
            "creditos": 3,
            "semestre": 8
        }
      ]
    }
""".trimIndent()


val equivalences = """
    [
        {
            "newSubject": "3",
            "actualSubjects": [
                "5801"
            ]
        },
        {
            "newSubject": "0",
            "actualSubjects": [
                "5001"
            ]
        },
        {
            "newSubject": "2",
            "actualSubjects": [
                "5005", "5006"
            ]
        },
        {
            "newSubject": "1",
            "actualSubjects": [
                "5201"
            ]
        },
        {
            "newSubject": "4",
            "actualSubjects": [
                "5105"
            ]
        },
        {
            "newSubject": "5",
            "actualSubjects": [
                "9101"
            ]
        },
        {
            "newSubject": "6",
            "actualSubjects": [
                "5301"
            ]
        },
        {
            "newSubject": "7",
            "actualSubjects": [
                "5202"
            ]
        },
        {
            "newSubject": "8",
            "actualSubjects": [
                "5002"
            ]
        },
        {
            "newSubject": "9",
            "actualSubjects": [
                "5106"
            ]
        },
        {
            "newSubject": "10",
            "actualSubjects": [
                "6101"
            ]
        },
        {
            "newSubject": "11",
            "actualSubjects": [
                "9102"
            ]
        },
        {
            "newSubject": "12",
            "actualSubjects": [
                "2601", "2602"
            ]
        },
        {
            "newSubject": "13",
            "actualSubjects": [
                "5203"
            ]
        },
        {
            "newSubject": "14",
            "actualSubjects": [
                "5003"
            ]
        },
        {
            "newSubject": "15",
            "actualSubjects": [
                "5302"
            ]
        },
        {
            "newSubject": "16",
            "actualSubjects": [
                "5102"
            ]
        },
        {
            "newSubject": "17",
            "actualSubjects": [
                "6102"
            ]
        },
        {
            "newSubject": "18",
            "actualSubjects": [
                "9002"
            ]
        },
        {
            "newSubject": "19",
            "actualSubjects": [
                "2501", "2502"
            ]
        },
        {
            "newSubject": "20",
            "actualSubjects": [
                "2701", "2702"
            ]
        },
        {
            "newSubject": "21",
            "actualSubjects": [
                "5205"
            ]
        },
        {
            "newSubject": "22",
            "actualSubjects": [
                "5204"
            ]
        },
        {
            "newSubject": "23",
            "actualSubjects": [
                "5206"
            ]
        },
        {
            "newSubject": "24",
            "actualSubjects": [
                "5004"
            ]
        },
        {
            "newSubject": "25",
            "actualSubjects": [
                "6103"
            ]
        },
        {
            "newSubject": "26",
            "actualSubjects": [
                "2402"
            ]
        },
        {
            "newSubject": "27",
            "actualSubjects": [
                "2401"
            ]
        },
        {
            "newSubject": "29",
            "actualSubjects": [
                "2901"
            ]
        },
        {
            "newSubject": "30",
            "actualSubjects": [
                "5303"
            ]
        },
        {
            "newSubject": "31",
            "actualSubjects": [
                "6104"
            ]
        },
        {
            "newSubject": "32",
            "actualSubjects": [
                "6202"
            ]
        },
        {
            "newSubject": "33",
            "actualSubjects": [
                "2403"
            ]
        },
        {
            "newSubject": "35",
            "actualSubjects": [
                "2902"
            ]
        },
        {
            "newSubject": "37",
            "actualSubjects": [
                "6106", "6105"
            ]
        },
        {
            "newSubject": "38",
            "actualSubjects": [
                "9003"
            ]
        },
        {
            "newSubject": "39",
            "actualSubjects": [
                "2404"
            ]
        },
        {
            "newSubject": "43",
            "actualSubjects": [
                "5304", "5305"
            ]
        },
        {
            "newSubject": "45",
            "actualSubjects": [
                "2405"
            ]
        },
        {
            "newSubject": "46",
            "actualSubjects": [
                "2803", "2802"
            ]
        },
        {
            "newSubject": "47",
            "actualSubjects": [
                "2903"
            ]
        },
        {
            "newSubject": "48",
            "actualSubjects": [
                "5902"
            ]
        }
    ]
""".trimIndent()