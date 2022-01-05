package ac.upm.pharmacy.service.impl;

import ac.upm.pharmacy.model.UsersModel;
import ac.upm.pharmacy.repository.UsersRepository;
import org.springframework.stereotype.Service;


@Service
public class UsersService {

    private final UsersRepository usersRepository;

    public UsersService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public UsersModel registerUser(String login, String password, String email){

        if(login == null || password == null){
            return null;
        }else{
            if(usersRepository.findDistinctFirstByLogin(login).isPresent()){
                return null;
            }
            UsersModel usersModel = new UsersModel();

                    usersModel.setLogin(login);
                    usersModel.setPassword(password);
                    usersModel.setEmail(email);

                        return usersRepository.save(usersModel);

        }

    }


    public UsersModel authenticate(String login, String password){

            return usersRepository.findByLoginAndPassword(login, password).orElse( null);
    }

}
