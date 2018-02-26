package injection;

import dagger.Component;

import javax.inject.Singleton;

@Singleton
@Component(modules ={FacebookModule.class})
public interface FacebookComponent {
  void inject(Tester tester);
}
