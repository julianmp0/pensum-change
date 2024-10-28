package org.julianmartinez.changepensum

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.*
import androidx.compose.material3.windowsizeclass.ExperimentalMaterial3WindowSizeClassApi
import androidx.compose.material3.windowsizeclass.WindowSizeClass
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.material3.windowsizeclass.calculateWindowSizeClass
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import changepensum.composeapp.generated.resources.Res
import changepensum.composeapp.generated.resources.github
import changepensum.composeapp.generated.resources.logo_unisangil_horizontal
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.julianmartinez.changepensum.models.Subject
import org.julianmartinez.changepensum.models.Pensum
import org.julianmartinez.changepensum.models.Semestre
import org.julianmartinez.changepensum.theme.selectedSubjectColor
import org.julianmartinez.changepensum.viewmodel.MainViewModel
import org.julianmartinez.changepensum.viewmodel.PensumStatistics
import org.koin.compose.viewmodel.koinViewModel
import org.koin.core.annotation.KoinExperimentalAPI

@OptIn(KoinExperimentalAPI::class, ExperimentalMaterial3WindowSizeClassApi::class)
@Composable
fun App(
    viewModel: MainViewModel = koinViewModel()
) {


    MaterialTheme {

        val size = calculateWindowSizeClass()


        val uriHandler = LocalUriHandler.current
        val uiState by viewModel.uiState.collectAsStateWithLifecycle()

        val openAlertDialog = remember { mutableStateOf(true) }

        LaunchedEffect(Unit){
            viewModel.loadPensum()
        }

        Column(
            modifier = Modifier.fillMaxSize()
        ) {

            if (size.widthSizeClass == WindowWidthSizeClass.Expanded) {

                Row(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxWidth()
                ) {
                    uiState.actualPensum?.let {
                        PensumView(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(16.dp)
                                .weight(1f),
                            pensum = it,
                            sizeClass = size,
                            pensumStatistics = uiState.actualPensumStatistics,
                            header = {
                                Column {
                                    Text(
                                        text = "Pensum actual",
                                        style = MaterialTheme.typography.titleLarge,
                                        fontWeight = FontWeight.Bold
                                    )


                                    Text(
                                        text = "Selecciona las materias que has aprobado",
                                        style = MaterialTheme.typography.titleLarge
                                    )
                                }
                            }
                        ){
                            viewModel.selectSubject(it)
                        }
                    }
                    uiState.newPensum?.let {
                        PensumView(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(16.dp)
                                .weight(1f),
                            pensum = it,
                            sizeClass = size,
                            pensumStatistics = uiState.newPensumStatistics,
                            header = {
                                Column {
                                    Text(
                                        text = "Pensum nuevo",
                                        style = MaterialTheme.typography.titleLarge,
                                        fontWeight = FontWeight.Bold
                                    )

                                }
                            },
                        )
                    }
                }
            }else{
                uiState.actualPensum?.let {
                    PensumView(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(16.dp)
                            .weight(1f),
                        pensum = it,
                        sizeClass = size,
                        pensumStatistics = uiState.actualPensumStatistics,
                        header = {
                            Column {
                                Text(
                                    text = "Pensum actual",
                                    style = MaterialTheme.typography.titleLarge,
                                    fontWeight = FontWeight.Bold
                                )

                            }
                        },
                        {
                            viewModel.selectSubject(it)
                        },
                    )
                }

                uiState.newPensum?.let {
                    PensumView(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(16.dp)
                            .weight(1f),
                        pensum = it,
                        sizeClass = size,
                        pensumStatistics = uiState.newPensumStatistics,
                        header = {
                            Column {
                                Text(
                                    text = "Pensum nuevo",
                                    style = MaterialTheme.typography.titleLarge,
                                    fontWeight = FontWeight.Bold
                                )

                            }
                        },
                    )
                }
            }



            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(MaterialTheme.colorScheme.surface)
                    .padding(16.dp)
                ,
            ) {
                Text(
                    text = buildAnnotatedString {
                        append("En el pensum actual te quedan ")
                        withStyle(style = SpanStyle(fontWeight = FontWeight.Bold)) {
                            append("${uiState.actualPensumStatistics.remainingCredits} créditos")
                        }
                        append(" por aprobar y ")
                        withStyle(style = SpanStyle(fontWeight = FontWeight.Bold)) {
                            append("${uiState.actualPensumStatistics.remainingSubjects} materias")
                        }
                        append(" por aprobar")
                    },
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center
                )

                Text(
                    text = buildAnnotatedString {
                        append("En el pensum nuevo te quedarian ")
                        withStyle(style = SpanStyle(fontWeight = FontWeight.Bold)) {
                            append("${uiState.newPensumStatistics.remainingCredits} créditos")
                        }
                        append(" por aprobar y ")
                        withStyle(style = SpanStyle(fontWeight = FontWeight.Bold)) {
                            append("${uiState.newPensumStatistics.remainingSubjects} materias")
                        }
                        append(" por aprobar")
                    },
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center
                )

                Row(
                    //verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {

                    Image(
                        painter = painterResource(Res.drawable.logo_unisangil_horizontal),
                        contentDescription = "Github",
                        modifier = Modifier.height(50.dp)
                    )

                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            "Made with Compose Multiplatform",
                        )

                        Image(
                            painter = painterResource(Res.drawable.github),
                            contentDescription = "Github",
                            modifier = Modifier.height(40.dp).clickable {
                                uriHandler.openUri("https://github.com/julianmp0/pensum-change")
                            }
                        )
                    }
                }
            }
        }


        if (openAlertDialog.value) {
            Dialog(
                onDismissRequest = { openAlertDialog.value = false }
            ) {
                AlertDialog(
                    onDismissRequest = { openAlertDialog.value = false },
                    title = {
                        Text("Verifica si es viable el cambio de pensum")
                    },
                    text = {
                        Text("Selecciona las materias que has aprobado en el plan de estudios actual." +
                                "\nLas materias homologadas en el nuevo plan de estudios se marcarán en color verde.")
                    },
                    confirmButton = {
                        Button(
                            onClick = { openAlertDialog.value = false }
                        ) {
                            Text("Ok")
                        }
                    }
                )
            }
        }
    }
}

@Composable
fun PensumView(
    modifier: Modifier,
    pensum: Pensum,
    sizeClass: WindowSizeClass,
    pensumStatistics: PensumStatistics,
    header: @Composable () -> Unit,
    onSubjectSelected: ((Subject) -> Unit)? = null
){
    Column(
        modifier = modifier
    ) {

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {

            header()

            Column(
                horizontalAlignment = Alignment.End
            ) {
                Text(
                    text = "Creditos aprobados: ${pensumStatistics.approvedCredits}",
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.Bold
                )

                Text(
                    text = "Creditos restantes: ${pensumStatistics.remainingCredits}",
                    style = MaterialTheme.typography.titleSmall,

                )

                Text(
                    text = "Materias aprobadas: ${pensumStatistics.approvedSubjects}",
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.Bold
                )


                Text(
                    text = "Materias restantes: ${pensumStatistics.remainingSubjects}",
                    style = MaterialTheme.typography.titleSmall
                )
            }
        }
        SemesterPensumView(pensum = pensum, onSubjectSelected = onSubjectSelected, sizeClass = sizeClass)
    }
}

@Composable
fun SemesterPensumView(
    pensum: Pensum,
    sizeClass: WindowSizeClass,
    onSubjectSelected: ((Subject) -> Unit)? = null
) {
    LazyColumn {

        pensum.groupBySemestre().forEach { (semestre, materias) ->
            item {
                SemestreItem(semestre = Semestre(materias, semestre), sizeClass, onSubjectSelected = onSubjectSelected)
                HorizontalDivider()
            }
        }

    }
}

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun SemestreItem(
    semestre: Semestre,
    sizeClass: WindowSizeClass,
    onSubjectSelected: ((Subject) -> Unit)? = null
) {

    Column(
        modifier = Modifier.padding(vertical = 8.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Text(
            text = "Semestre ${semestre.semestre}",
            style = MaterialTheme.typography.titleMedium,
            fontWeight = FontWeight.Bold,
            //modifier = Modifier.padding(bottom = 8.dp)
        )
        FlowRow(
            //modifier = Modifier.padding(start = 16.dp, end = 16.dp),
        ) {
            semestre.materias.forEach { materia ->
                SubjectItem(sizeClass, materia, onSubjectSelected)
                //Text(materia.nombre)
            }
        }
    }
}

@Composable
fun SubjectItem(
    sizeClass: WindowSizeClass,
    subject: Subject,
    onSubjectSelected: ((Subject) -> Unit)? = null
) {



    OutlinedCard(
        modifier = Modifier.padding(4.dp).width(150.dp).clickable(
            enabled = onSubjectSelected != null,
        ) {
            onSubjectSelected?.invoke(subject)
        },
        colors = if (subject.isSelected) {
            CardDefaults.outlinedCardColors(
                containerColor = selectedSubjectColor.copy(alpha = 0.2f),
            )
        } else {
            CardDefaults.outlinedCardColors(
                containerColor = selectedSubjectColor.copy(alpha = 0.05f),
            )
        },
        border = if (subject.isSelected) {
            BorderStroke(3.dp, selectedSubjectColor)
        } else {
            BorderStroke(1.dp, selectedSubjectColor.copy(alpha = 0.1f))
        }
    ) {
        Column(
            modifier = Modifier.padding(8.dp)
        ) {

            if (sizeClass.widthSizeClass == WindowWidthSizeClass.Expanded) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(text = subject.codigo, style = MaterialTheme.typography.labelSmall)
                    Text(
                        text = "Créditos: ${subject.creditos}",
                        style = MaterialTheme.typography.labelSmall,
                        fontWeight = FontWeight.Bold
                    )
                }
            }


            Text(
                modifier = Modifier.fillMaxWidth(),
                text = subject.nombre,
                style = MaterialTheme.typography.bodyMedium,
                fontWeight = FontWeight.Bold,
                minLines = 2,
                textAlign = TextAlign.Center
            )
        }

    }

}

@Preview
@Composable
fun PreviewPensumView() {
    //PensumView(pensum =  Json.decodeFromString<Pensum>(actualPensum))
}