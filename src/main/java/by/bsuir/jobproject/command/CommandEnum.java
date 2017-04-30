package by.bsuir.jobproject.command;

import by.bsuir.jobproject.command.impl.*;
import by.bsuir.jobproject.command.impl.user.*;
import by.bsuir.jobproject.command.impl.vacancy.*;

/**
 * Created by AR on 29.04.2017.
 */
public enum CommandEnum {

    TO_LOGIN {
        {
            this.command = new ToLoginCommand();
        }
    },
    TO_REGISTER {
        {
            this.command = new ToRegisterCommand();
        }
    },

    LOGIN {
        {
            this.command = new LoginCommand();
        }
    },
    LOGOUT {
        {
            this.command = new LogoutCommand();
        }
    },
    REGISTER {
        {
            this.command = new RegisterCommand();
        }
    },
    VIEW_USERS {
        {
            this.command = new UserListCommand();
        }
    },
    CREATE_USER {
        {
            this.command = new CreateUserCommand();
        }
    },
    UPDATE_USER {
        {
            this.command = new UpdateUserCommand();
        }
    },
    DELETE_USER {
        {
            this.command = new DeleteUserCommand();
        }
    },
    TO_CREATE_USER {
        {
            this.command = new ToCreateUserCommand();
        }
    },
    TO_UPDATE_USER {
        {
            this.command = new ToUpdateUserCommand();
        }
    },

    VIEW_VACANCIES {
        {
            this.command = new VacancyListCommand();
        }
    },
    TO_CREATE_VACANCY {
        {
            this.command = new ToCreateVacancyCommand();
        }
    },
    TO_UPDATE_VACANCY {
        {
            this.command = new ToUpdateVacancyCommand();
        }
    },
    CREATE_VACANCY {
        {
            this.command = new CreateVacancyCommand();
        }
    },
    UPDATE_VACANCY {
        {
            this.command = new UpdateVacancyCommand();
        }
    },
    DELETE_VACANCY {
        {
            this.command = new DeleteVacancyCommand();
        }
    };


    ActionCommand command;

    public ActionCommand getCommand() {
        return command;
    }

}
