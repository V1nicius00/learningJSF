package dev.vini.learningJSF.bean.estudante;

import dev.vini.learningJSF.model.Estudante;

import javax.inject.Named;
import java.io.Serializable;
import java.util.*;

import static java.util.Arrays.asList;

@Named
public class EstudanteRegistrarBean implements Serializable {

    private Estudante estudante = new Estudante();
    private String[] nomesArray = {"NomeArray1", "NomeArray2", "NomeArray3"};
    private List<String> nomesList = asList("NomeList1", "NomeList2", "NomeList3");
    private Set<String> nomesSet = new HashSet<>(asList("NomeSet1", "NomeSet2", "NomeSet3"));
    private Map<String, String> nomesMap = new HashMap<>();

    {
        nomesMap.put("NomeSet1", "SobrenomeSet1");
        nomesMap.put("NomeSet2", "SobrenomeSet2");
        nomesMap.put("NomeSet3", "SobrenomeSet3");
    }

    public String redirectTo(String page){
        return page+"?faces-redirect=true";
    }

    public Map<String, String> getNomesMap() {
        return nomesMap;
    }

    public void setNomesMap(Map<String, String> nomesMap) {
        this.nomesMap = nomesMap;
    }

    public Set<String> getNomesSet() {
        return nomesSet;
    }

    public void setNomesSet(Set<String> nomeSet) {
        this.nomesSet = nomeSet;
    }

    public List<String> getNomesList() {
        return nomesList;
    }

    public void setNomesList(List<String> nomesList) {
        this.nomesList = nomesList;
    }

    public String[] getNomesArray() {
        return nomesArray;
    }

    public void setNomesArray(String[] nomesArray) {
        this.nomesArray = nomesArray;
    }

    public Estudante getEstudante() {
        return estudante;
    }

    public void setEstudante(Estudante estudante) {
        this.estudante = estudante;
    }
}
