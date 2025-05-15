
public class ValidadorEmail {

    public static boolean validar(String email) {

        //Verificando existencia de "@" e "."
        if (!email.contains("@") || !email.substring(email.indexOf("@")).contains(".")) {
            System.out.println("O email não contem: @ ou . - " + email + "\n---------");
            return false;
        }else if (email.substring(email.indexOf("@") + 1).contains("@")) {
            System.out.println("O email contem mais de um @ - " + email + "\n---------");
            return false;
        }

        String nomeDeUsuario = email.substring(0, email.indexOf("@"));
        String sufixo = email.substring(email.lastIndexOf(".") + 1);
        String dominio = email.substring(email.lastIndexOf("@") + 1, email.lastIndexOf("."));

        //Validando existencia do corpo do email
        if (nomeDeUsuario.isEmpty()) {
            System.out.println("O email não contem: nome de usuario - " + email + "\n---------");
            return false;
        } else  if (dominio.isEmpty()) {
            System.out.println("O email não contem: dominio - " + email + "\n---------");
            return false;
        } else  if (sufixo.isEmpty()) {
            System.out.println("O email não contem: sufixo - " + email + "\n---------");
            return false;
        }

        //Validando nome de usuario
        var nomeFormatado = nomeDeUsuario.toCharArray();

        for (char c : nomeFormatado) {
            if (!Character.isLetterOrDigit(c) && "!@#$%&*()!/+=^><?\\".indexOf(c) > -1
                    || Character.isSpaceChar(c)) {
                System.out.println("O email contem caracteres especiais ou espaços em branco " +
                        "- " + email + "\n---------");
                return false;
            }
        }

        //Validando dominio
        var dominioFormatado = dominio.toCharArray();

        for (char c : dominioFormatado) {
            if ((!Character.isLetterOrDigit(c) && "!@#$%&*()!/+=^><?\\".indexOf(c) > -1)
                    || Character.isUpperCase(c) || Character.isSpaceChar(c)) {
                System.out.println("O dominio do email esta invalido " +
                        "- " + email + "\n---------");
                return false;
            }
        }

        //Validando sufixo
        if (sufixo.length() > 3 || sufixo.length() < 2) {
            System.out.println("O sufixo deve ter de 2 a 3 caracteres" + "\n---------");
            return false;
        }

        var sufixoFormatado = sufixo.toCharArray();

        for (char c : sufixoFormatado) {
            if ((!Character.isLetter(c) && "!@#$%&*()!/+=^><?\\".indexOf(c) > -1) || Character.isUpperCase(c)
                    || Character.isSpaceChar(c) || Character.isDigit(c)) {
                System.out.println("O sufixo do email está inválido " +
                        "- " + email + "\n---------");
                return false;
            }
        }
            return true;
    }
}