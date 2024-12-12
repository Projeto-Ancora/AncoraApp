package com.example.ancora.Telas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.ancora.R
import com.example.ancora.ui.theme.AncoraTheme
import com.example.ancora.ui.theme.Fontebaloo

@Composable
fun TermosDeUsoEPrivacidade(modifier: Modifier = Modifier, navController: NavController){
                Box(
                    modifier = modifier
                        .fillMaxSize()
                        .background(color = Color(0xff2da2db))
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .verticalScroll(rememberScrollState())
                            .padding(horizontal = 16.dp)
                    ) {
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(vertical = 16.dp)
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.setavoltar),
                                contentDescription = "Seta de Voltar",
                                modifier = Modifier
                                    .size(28.dp)
                                    .align(Alignment.CenterStart)
                                    .clickable {
                                        navController.popBackStack()
                                    }
                            )
                            Text(
                                text = "Termos De Uso",
                                color = Color.White,
                                fontFamily = Fontebaloo,
                                textAlign = TextAlign.Center,
                                style = MaterialTheme.typography.headlineSmall,
                                modifier = Modifier
                                    .align(Alignment.Center)
                                    .padding(top = 16.dp)
                            )
                        }

                        Spacer(modifier = Modifier.height(12.dp))

                        Image(
                            painter = painterResource(id = R.drawable.logogrande),
                            contentDescription = "Logo grande",
                            modifier = Modifier
                                .size(256.dp)
                                .align(Alignment.CenterHorizontally)
                        )

                        Spacer(modifier = Modifier.height(24.dp))

                        Text(
                            text = "\n" +
                                    "Seja bem-vindo ao aplicativo Âncora, uma plataforma dedicada à educação financeira básica para crianças. Ao usar nosso aplicativo, você concorda com os seguintes Termos de Uso, elaborados de acordo com a Lei Geral de Proteção de Dados (LGPD - Lei nº 13.709/2018).\n" +
                                    "\n" +
                                    "Coleta e Tratamento de Dados Pessoais\n" +
                                    "O Âncora coleta dados pessoais apenas quando estritamente necessário, em conformidade com a LGPD. Os dados coletados podem incluir:\n" +
                                    "Nome e sobrenome da criança (opcional e com consentimento dos pais ou responsáveis).\n" +
                                    "Dados de contato dos pais ou responsáveis (e-mail, telefone, etc.).\n" +
                                    "Informações de progresso e interação dentro do aplicativo, como histórico de atividades e pontuação.\n" +
                                    "Esses dados serão utilizados para:\n" +
                                    "\n" +
                                    "Oferecer suporte educacional personalizado à criança.\n" +
                                    "Enviar atualizações e comunicados relevantes aos pais ou responsáveis.\n" +
                                    "Melhorar a experiência e as funcionalidades do aplicativo.\n" +
                                    "Base legal para o tratamento de dados: Consentimento dos responsáveis, conforme artigo 7º da LGPD.\n" +
                                    "\n" +
                                    "Finalidade do Tratamento de Dados\n" +
                                    "O Âncora trata os dados pessoais com as seguintes finalidades:\n" +
                                    "Garantir uma experiência educativa adequada à faixa etária do usuário.\n" +
                                    "Realizar melhorias no conteúdo e nas funcionalidades do aplicativo.\n" +
                                    "Enviar comunicações referentes ao uso do aplicativo aos responsáveis.\n" +
                                    "Os dados coletados nunca serão utilizados para fins comerciais ou compartilhados com terceiros sem o consentimento explícito dos responsáveis legais.\n" +
                                    "\n" +
                                    "Segurança dos Dados\n" +
                                    "O Âncora adota medidas técnicas e administrativas adequadas para proteger os dados pessoais contra acessos não autorizados, vazamentos, alterações ou destruição. Asseguramos que apenas pessoas autorizadas terão acesso aos dados e que implementamos tecnologias modernas de criptografia para proteger todas as informações.\n" +
                                    "\n" +
                                    "Compartilhamento de Dados\n" +
                                    "O Âncora não compartilha dados pessoais com terceiros, exceto quando necessário para cumprir obrigações legais ou regulamentares. Em situações onde o compartilhamento seja necessário para a prestação do serviço (por exemplo, com serviços de armazenamento em nuvem), garantimos que os terceiros cumpram as normas da LGPD e ofereçam segurança equivalente.\n" +
                                    "\n" +
                                    "Direitos dos Titulares dos Dados\n" +
                                    "Os titulares dos dados (no caso de menores de idade, os responsáveis legais) possuem os seguintes direitos:\n" +
                                    "\n" +
                                    "Acesso aos dados coletados.\n" +
                                    "Correção de dados incompletos, inexatos ou desatualizados.\n" +
                                    "Solicitação de eliminação de dados pessoais.\n" +
                                    "Revogação do consentimento a qualquer momento.\n" +
                                    "Para exercer esses direitos, entre em contato conosco através do e-mail projetoancoradev2024@gmail.com.\n" +
                                    "\n" +
                                    "Armazenamento e Prazo de Retenção dos Dados\n" +
                                    "Os dados pessoais serão armazenados durante o período necessário para o cumprimento das finalidades para as quais foram coletados. Ao término deste período, os dados serão devidamente eliminados, exceto quando houver obrigação legal para mantê-los.\n" +
                                    "\n" +
                                    "Alterações nos Termos de Uso\n" +
                                    "O Âncora se reserva o direito de alterar estes Termos de Uso a qualquer momento, mediante aviso aos usuários. Recomendamos que os pais ou responsáveis revisem periodicamente esta seção para estar ciente de eventuais mudanças.\n" +
                                    "\n" +
                                    "Contato\n" +
                                    "Em caso de dúvidas, reclamações ou solicitações referentes a estes Termos de Uso ou à política de privacidade, entre em contato conosco pelo e-mail projetoancoradev2024@gmail.com.",
                            color = Color.White,
                            fontFamily = Fontebaloo,
                            textAlign = TextAlign.Center,
                            style = TextStyle(
                                fontSize = 15.sp
                            ),
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(top = 16.dp)
                        )
                    }
                }
            }


@Preview(widthDp = 360, heightDp = 3154)
@Composable
private fun TermosDeUsoEPrivacidadePreview() {
    TermosDeUsoEPrivacidade(Modifier, navController = rememberNavController())
}