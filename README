# 🎵 LinkToSound - API REST com Java Spring Boot

**LinkToSound** é uma API desenvolvida em Java utilizando o framework Spring Boot. Essa API permite extrair o áudio de vídeos do YouTube por meio de um link fornecido, convertendo e retornando o áudio em formato `.mp3` diretamente para o usuário.

---

## 🚀 Funcionalidades

- ✅ Recebe um link do YouTube como parâmetro.
- ✅ Faz download do áudio utilizando o pacote `yt-dlp`.
- ✅ Converte o áudio para o formato `.mp3` com `ffmpeg`.
- ✅ Retorna o áudio convertido para download.
- ✅ Remove os arquivos temporários após o envio da resposta.

---

## 🧰 Tecnologias Utilizadas

- Java 21
- Spring Boot 3.x
- Spring Web
- ProcessBuilder (execução de comandos externos)
- yt-dlp
- ffmpeg / ffprobe

---

## 📦 Instalação de Dependências Necessárias

Antes de executar a API, certifique-se de que os seguintes pacotes estão **instalados e configurados no PATH do seu sistema operacional**:

| Pacote  | Descrição                              | Instalação no Windows / Linux                            |
|---------|------------------------------------------|----------------------------------------------------------|
| `yt-dlp` | Utilitário para baixar vídeos do YouTube | `pip install yt-dlp`                                     |
| `ffmpeg` | Conversor de áudio e vídeo              | [Baixe aqui](https://ffmpeg.org/download.html) ou use `sudo apt install ffmpeg` |
| `ffprobe` | Utilitário de inspeção de arquivos de mídia | Já incluído na instalação padrão do ffmpeg |

---

## 🔧 Como Executar o Projeto

1. Clone o repositório:
   ```bash
   git clone https://github.com/Jarbson-Ferreira/LinkToSound.git
   cd LinkToSound
   ```

2. Certifique-se de ter o Java 17+ e Maven instalados.

3. Execute o projeto:
   ```bash
   ./mvnw spring-boot:run
   ```

---

## 🔁 Exemplo de Uso

### Requisição:

**GET** `http://localhost:8080/api/audio/download?url=https://www.youtube.com/watch?v=dQw4w9WgXcQ`

### Resposta:

- Download automático do arquivo `audio.mp3` correspondente ao vídeo informado.

---

## 🧹 Limpeza de Arquivos Temporários

Após o envio do áudio, todos os arquivos temporários são automaticamente removidos do sistema, garantindo segurança e economia de espaço.

---

## 🛡️ Avisos Legais

Este projeto é para fins educacionais. O uso indevido da API para violação de direitos autorais é de responsabilidade do usuário.

---

## 👨‍💻 Autor

**Jarbson Ferreira**  
[GitHub](https://github.com/Jarbson-Ferreira)  
Projeto desenvolvido como prática em Java e manipulação de mídia via terminal.
