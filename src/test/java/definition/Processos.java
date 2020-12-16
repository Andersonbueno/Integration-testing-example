package definition;

import groovy.json.internal.LazyMap;

public class Processos {

    private static final String URL_processos = "http://agapito-server.herokuapp.com/processos/";
    private static LazyMap camposJson = new LazyMap();
    private static String UltimoUsuario;

    public static void preencherCampo(String field, String value) {
        camposJson.put(field, value);
    }

    public static void limparCampos() {
        camposJson.clear();
    }
    public static LazyMap obterCampos() {
        return camposJson;
    }

    public static String obterEndPoint() {
        return URL_processos;
    }

    public static String obterUltimoUsuario() {
        return UltimoUsuario;
    }

    public static void definirUltimoUsario(String lastUser) {
        Usuario.UltimoUsuario = UltimoUsuario;
    }
}
