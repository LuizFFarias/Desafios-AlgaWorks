public enum StatusNotaFiscal {

    STATUS_NAO_EMITIDA("Não Emitida") {

        @Override
        public boolean podeMudarParaCancelada(double valor) {
            return true;
        }

        @Override
        public boolean podeMudarParaEmitida(double valor) {
            return true;
        }
    },
    STATUS_EMITIDA("Emitida") {

        @Override
        public boolean podeMudarParaCancelada(double valor) {
            return valor < 1000;
        }

        @Override
        public boolean podeMudarParaEmitida(double valor) {
            return false;
        }
    },
    STATUS_CANCELADA("Cancelada") {

        @Override
        public boolean podeMudarParaCancelada(double valor) {
            return false;
        }

        @Override
        public boolean podeMudarParaEmitida(double valor) {
            return false;
        }
    };

    private String descricao;

    StatusNotaFiscal(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public abstract boolean podeMudarParaCancelada(double valor);
    public abstract boolean podeMudarParaEmitida(double valor);
}
