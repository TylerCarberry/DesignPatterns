package injection.dagger;

import dagger.Component;
import injection.Tester;

import javax.inject.Singleton;

@Singleton
@Component(modules ={FacebookModule.class})
public interface FacebookComponent {
  void inject(Tester tester);
}
