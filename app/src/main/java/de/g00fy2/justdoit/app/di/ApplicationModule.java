package de.g00fy2.justdoit.app.di;

import android.content.Context;
import dagger.Module;
import dagger.Provides;
import de.g00fy2.justdoit.app.MyApplication;
import javax.inject.Singleton;

/**
 * Created by Thomas Wirth on 04.10.2017.
 */

@Module
public class ApplicationModule {

    private MyApplication application;

    public ApplicationModule(MyApplication application) {
        this.application = application;
    }

    @Provides @Singleton MyApplication provideApplication() {
        return application;
    }

    @Provides @Singleton public Context provideContext() {
        return application;
    }
}
