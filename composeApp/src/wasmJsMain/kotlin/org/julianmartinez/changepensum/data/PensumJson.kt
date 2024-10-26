package org.julianmartinez.changepensum.data

val actualPensum = """
    {
      "semestres": [
        {
          "semestre": 1,
          "materias": [
            {
              "codigo": "5201",
              "nombre": "Fundamentos de Programación",
              "creditos": 4,
              "teoria": 64,
              "practica": 192
            },
            {
              "codigo": "5401",
              "nombre": "Diseño Asistido por Computador",
              "creditos": 8,
              "teoria": 0,
              "practica": 144
            },
            {
              "codigo": "5001",
              "nombre": "Cálculo Diferencial",
              "creditos": 4,
              "teoria": 64,
              "practica": 192
            },
            {
              "codigo": "5004",
              "nombre": "Álgebra Superior",
              "creditos": 2,
              "teoria": 32,
              "practica": 96
            },
            {
              "codigo": "9001",
              "nombre": "Introducción a la Ingeniería",
              "creditos": 2,
              "teoria": 32,
              "practica": 96
            }
          ]
        },
        {
          "semestre": 2,
          "materias": [
            {
              "codigo": "5202",
              "nombre": "Programación 1",
              "creditos": 4,
              "teoria": 64,
              "practica": 192
            },
            {
              "codigo": "5002",
              "nombre": "Cálculo Integral",
              "creditos": 4,
              "teoria": 64,
              "practica": 192
            },
            {
              "codigo": "5005",
              "nombre": "Álgebra Lineal",
              "creditos": 2,
              "teoria": 32,
              "practica": 96
            },
            {
              "codigo": "5101",
              "nombre": "Química General",
              "creditos": 4,
              "teoria": 64,
              "practica": 144
            },
            {
              "codigo": "9002",
              "nombre": "Expresión 1",
              "creditos": 2,
              "teoria": 32,
              "practica": 96
            }
          ]
        },
        {
          "semestre": 3,
          "materias": [
            {
              "codigo": "5203",
              "nombre": "Estructura de Datos",
              "creditos": 4,
              "teoria": 64,
              "practica": 192
            },
            {
              "codigo": "5003",
              "nombre": "Cálculo en Varias Variables",
              "creditos": 4,
              "teoria": 64,
              "practica": 192
            },
            {
              "codigo": "5104",
              "nombre": "Mecánica",
              "creditos": 4,
              "teoria": 64,
              "practica": 144
            }
          ]
        },
        {
          "semestre": 4,
          "materias": [
            {
              "codigo": "5204",
              "nombre": "Base de Datos",
              "creditos": 4,
              "teoria": 64,
              "practica": 192
            },
            {
              "codigo": "5006",
              "nombre": "Matemáticas Discretas",
              "creditos": 4,
              "teoria": 64,
              "practica": 192
            }
          ]
        },
        {
          "semestre": 5,
          "materias": [
            {
              "codigo": "5205",
              "nombre": "Análisis de Algoritmos",
              "creditos": 4,
              "teoria": 64,
              "practica": 192
            },
            {
              "codigo": "5004",
              "nombre": "Ecuaciones Diferenciales",
              "creditos": 3,
              "teoria": 48,
              "practica": 144
            },
            {
              "codigo": "5105",
              "nombre": "Electromagnetismo",
              "creditos": 4,
              "teoria": 64,
              "practica": 144
            },
            {
              "codigo": "5102",
              "nombre": "Biología General",
              "creditos": 3,
              "teoria": 48,
              "practica": 144
            }
          ]
        },
        {
          "semestre": 6,
          "materias": [
            {
              "codigo": "5206",
              "nombre": "Programación 2",
              "creditos": 4,
              "teoria": 64,
              "practica": 192
            },
            {
              "codigo": "5301",
              "nombre": "Modelado y Análisis Numérico",
              "creditos": 4,
              "teoria": 64,
              "practica": 192
            },
            {
              "codigo": "5302",
              "nombre": "Probabilidad y Estadística",
              "creditos": 4,
              "teoria": 48,
              "practica": 144
            },
            {
              "codigo": "5107",
              "nombre": "Ondas y Partículas",
              "creditos": 4,
              "teoria": 64,
              "practica": 144
            }
          ]
        },
        {
          "semestre": 7,
          "materias": [
            {
              "codigo": "2401",
              "nombre": "Modelado de Sistemas",
              "creditos": 3,
              "teoria": 48,
              "practica": 144
            },
            {
              "codigo": "2402",
              "nombre": "Ingeniería de Software",
              "creditos": 3,
              "teoria": 48,
              "practica": 144
            },
            {
              "codigo": "2601",
              "nombre": "Arquitectura de Computadoras",
              "creditos": 3,
              "teoria": 48,
              "practica": 144
            },
            {
              "codigo": "5303",
              "nombre": "Investigación de Operaciones 1",
              "creditos": 4,
              "teoria": 64,
              "practica": 192
            }
          ]
        },
        {
          "semestre": 8,
          "materias": [
            {
              "codigo": "2403",
              "nombre": "Teoría de Sistemas",
              "creditos": 3,
              "teoria": 48,
              "practica": 144
            },
            {
              "codigo": "2602",
              "nombre": "Sistemas Operativos",
              "creditos": 3,
              "teoria": 48,
              "practica": 144
            },
            {
              "codigo": "2701",
              "nombre": "Comunicación de Datos",
              "creditos": 3,
              "teoria": 48,
              "practica": 144
            },
            {
              "codigo": "5304",
              "nombre": "Investigación de Operaciones 2",
              "creditos": 4,
              "teoria": 64,
              "practica": 192
            }
          ]
        },
        {
          "semestre": 9,
          "materias": [
            {
              "codigo": "2404",
              "nombre": "Arquitectura de Software",
              "creditos": 3,
              "teoria": 48,
              "practica": 144
            },
            {
              "codigo": "2405",
              "nombre": "Gestión de Proyectos de T.I.",
              "creditos": 3,
              "teoria": 48,
              "practica": 144
            },
            {
              "codigo": "2901",
              "nombre": "Electiva Profesional 1",
              "creditos": 3,
              "teoria": 48,
              "practica": 144
            },
            {
              "codigo": "2902",
              "nombre": "Trabajo de Grado 1",
              "creditos": 3,
              "teoria": 48,
              "practica": 144
            }
          ]
        },
        {
          "semestre": 10,
          "materias": [
            {
              "codigo": "2903",
              "nombre": "Electiva Profesional 2",
              "creditos": 3,
              "teoria": 48,
              "practica": 144
            },
            {
              "codigo": "2904",
              "nombre": "Trabajo de Grado 2",
              "creditos": 3,
              "teoria": 48,
              "practica": 144
            },
            {
              "codigo": "2905",
              "nombre": "Electiva Profesional 3",
              "creditos": 3,
              "teoria": 48,
              "practica": 144
            }
          ]
        }
      ]
    }

""".trimIndent()