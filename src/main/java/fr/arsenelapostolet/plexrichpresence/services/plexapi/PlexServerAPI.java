package fr.arsenelapostolet.plexrichpresence.services.plexapi;

import fr.arsenelapostolet.plexrichpresence.model.PlexSessions;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Header;

public interface PlexServerAPI {

    @GET("/status/sessions")
    Call<PlexSessions> getSessions(@Header("X-Plex-Token") String token, @Header("Accept") String accept);
}
