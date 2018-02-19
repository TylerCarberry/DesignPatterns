package injection;

import dagger.Component;

import javax.inject.Singleton;

@Singleton
@Component(modules ={NetworkModule.class})
public interface AppComponent {
  void inject(Tester tester);
}
