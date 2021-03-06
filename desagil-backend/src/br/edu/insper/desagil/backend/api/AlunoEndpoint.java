package br.edu.insper.desagil.backend.api;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import br.edu.insper.desagil.backend.core.Endpoint;
import br.edu.insper.desagil.backend.core.exception.APIException;
import br.edu.insper.desagil.backend.core.exception.DBException;
import br.edu.insper.desagil.backend.db.AlunoDAO;
import br.edu.insper.desagil.backend.model.Aluno;

public class AlunoEndpoint extends Endpoint<Aluno> {
    public AlunoEndpoint() {
        super("/aluno");
    }
    
    @Override
    public Aluno get(Map<String, String> args) throws APIException {
        AlunoDAO dao = new AlunoDAO();
        Aluno aluno;
        try {
            aluno = dao.retrieve(args.get("matricula"));
        } catch (DBException exception) {
            return null;
        }
        return aluno;
    }
    
    @Override
    public Map<String, String> post(Map<String, String> args, Aluno aluno) throws APIException {
        AlunoDAO dao = new AlunoDAO();
        Date date;
        try {
            date = dao.create(aluno);
        } catch (DBException exception) {
            return null;
        }
        Map<String, String> body = new HashMap<>();
        body.put("date", date.toString());
        return body;
    }
    
    @Override
    public Map<String, String> put(Map<String, String> args, Aluno aluno) throws APIException {
        AlunoDAO dao = new AlunoDAO();
        Date date;
        try {
            date = dao.update(aluno);
        } catch (DBException exception) {
            return null;
        }
        Map<String, String> body = new HashMap<>();
        body.put("date", date.toString());
        return body;
    }
    
    @Override
    public Map<String, String> delete(Map<String, String> args) throws APIException {
        AlunoDAO dao = new AlunoDAO();
        Date date;
        try {
            date = dao.delete(args.get("matricula"));
        } catch (DBException exception) {
            return null;
        }
        Map<String, String> body = new HashMap<>();
        body.put("date", date.toString());
        return body;
    }

}
