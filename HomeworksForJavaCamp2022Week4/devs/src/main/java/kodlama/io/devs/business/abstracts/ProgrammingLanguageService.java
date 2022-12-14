package kodlama.io.devs.business.abstracts;

import java.util.List;

import kodlama.io.devs.entities.concrete.ProgrammingLanguage;

public interface ProgrammingLanguageService {
	void add(ProgrammingLanguage programmingLanguage);
	void delete(int id);
	void update(ProgrammingLanguage programmingLanguage);
	
	List<ProgrammingLanguage> getAll();
	ProgrammingLanguage getById(int id);
	ProgrammingLanguage getByName(String name);
}
