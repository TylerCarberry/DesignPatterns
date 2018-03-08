package injection.dagger;

import dagger.Component;
import injection.TestsWithMockito;

import javax.inject.Singleton;

@Singleton
@Component(modules ={TestFacebookModule.class})
public interface TestFacebookComponent {
    void inject(TestsWithMockito test);
}
