public class Quest1_ClinicaPaciente {

    public static void main(String[] args){

        Quest1_Paciente paciente_1 = new Quest1_Paciente("Roberto Santos", 13, "21/09/2004", "Masculino", "Nenhuma", "Nenhum", "B+");

        System.out.println("Codigo: "+paciente_1.getCodigo());
        System.out.println("Nome: "+ paciente_1.getNome());
        System.out.println("Data de Nascimento: "+ paciente_1.getDataNascimento());
        System.out.println("Sexo: "+ paciente_1.getSexo());
        System.out.println("Plano de saude: "+ paciente_1.getPlanoSaude());
        System.out.println("Alergia: "+ paciente_1.getAlergia());
        System.out.println("Tipo Sanguíneo: "+ paciente_1.getTipoSanguineo());

        paciente_1.setNome("João Fernando");
        paciente_1.setDataNascimento("24/09/1982");
        paciente_1.setSexo("Masculino");
        paciente_1.setTipoSanguineo("A-");
        paciente_1.setAlergia("Asma");
        paciente_1.setPlanoSaude("Avancado");
        paciente_1.setCodigo(25);

        System.out.println("Codigo: "+paciente_1.getCodigo());
        System.out.println("Nome: "+ paciente_1.getNome());
        System.out.println("Data de Nascimento: "+ paciente_1.getDataNascimento());
        System.out.println("Sexo: "+ paciente_1.getSexo());
        System.out.println("Plano de saude: "+ paciente_1.getPlanoSaude());
        System.out.println("Alergia: "+ paciente_1.getAlergia());
        System.out.println("Tipo Sanguíneo: "+ paciente_1.getTipoSanguineo());

    }
}