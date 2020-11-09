package ntk.android.base.services.core;

import java.util.Map;

import io.reactivex.Observable;
import ntk.android.base.api.baseModel.FilterModel;
import ntk.android.base.dtomodel.core.AuthRenewTokenModel;
import ntk.android.base.dtomodel.core.AuthUserChangePasswordModel;
import ntk.android.base.dtomodel.core.AuthUserForgetPasswordModel;
import ntk.android.base.dtomodel.core.AuthUserSignInModel;
import ntk.android.base.dtomodel.core.AuthUserSignOutModel;
import ntk.android.base.dtomodel.core.AuthUserSignUpModel;
import ntk.android.base.dtomodel.core.TokenDeviceClientInfoDtoModel;
import ntk.android.base.entitymodel.base.ErrorException;
import ntk.android.base.entitymodel.base.ErrorExceptionBase;
import ntk.android.base.entitymodel.base.TokenInfoModel;
import retrofit2.http.Body;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;

interface Icore {
    Observable<ErrorException<TokenInfoModel>> Captcha();

    @POST("{cpath}")
    @Headers({"content-type: application/json"})
    Observable<ErrorException<TokenInfoModel>> getTokenDevice(@Path("cpath") String cpath, @HeaderMap Map<String, String> headers, @Body TokenDeviceClientInfoDtoModel request);

    Observable<ErrorException<TokenInfoModel>> signupUser(AuthUserSignUpModel model);

    Observable<ErrorException<TokenInfoModel>> signinUser(AuthUserSignInModel model);

    Observable<ErrorException<TokenInfoModel>> renewToken(AuthRenewTokenModel model);

    Observable<ErrorException<TokenInfoModel>> changePassword(AuthUserChangePasswordModel model);

    Observable<ErrorException<TokenInfoModel>> forgetPassword(AuthUserForgetPasswordModel model);

    Observable<ErrorExceptionBase> logout(AuthUserSignOutModel model);

    Observable<ErrorExceptionBase> existToken(FilterModel model);
}