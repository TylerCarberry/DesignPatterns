package injection.dagger;

import dagger.Component;
import injection.FacebookApp;

import javax.inject.Singleton;

@Singleton
@Component(modules = {FacebookModule.class})
public interface FacebookComponent {
    void inject(FacebookApp facebookApp);
}
