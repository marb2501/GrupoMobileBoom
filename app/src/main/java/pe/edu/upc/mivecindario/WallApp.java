package pe.edu.upc.mivecindario;

import android.app.Application;

import pe.edu.upc.mivecindario.services.WallServices;

/**
 * Created by AlfredoRegis on 12/5/16.
 */

public class WallApp extends Application {
        static WallApp instance;
        WallServices service = new WallServices();

        public WallApp() {
            super();
            instance = this;
        }

        public static WallApp getInstance() {
            return instance;
        }

        public WallServices getService() {
            return service;
        }
}


