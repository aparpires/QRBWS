package qrbws.sender.messages

import qrbws.ContaUsuario

class MessageCreatorEmailRegister implements IMessageCreator {
    MessageType getType() {
        MessageType.CADASTRO_USUARIO;
    }

    String create(ContaUsuario contaUsuario) {
        """<h2>Parabéns ${contaUsuario.pessoa.nome}, o cadastro foi realizado com sucesso !</h2><hr/>
<p><strong>Usuário: </strong><span>${contaUsuario.username}</span></p>
<p><strong>Senha: </strong><span>${contaUsuario.password}</span></p>
<hr/>
Obrigado por utilizar o nosso sistema, Qr-Bibliokode Team <img src=\"https://mail.google.com/mail/u/0/e/360\" goomoji=\"360\" style=\"margin: 0px 0.2ex; vertical-align: middle;\">"""
    }
}