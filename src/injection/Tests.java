package injection;

import static org.mockito.Mockito.mock;

/**
 * Created by johnathansaunders on 3/5/18.
 */
public class Tests {
    FacebookApi facebookApi = mock(FacebookApi.class);
    Tests(){
        facebookApi.postOnFacebook("Having a great time in OOD!");
        facebookApi.postImage("https://www.petmd.com/sites/default/files/petmd-cat-happy-10.jpg");
        //when(facebookApi.)
    }
}
