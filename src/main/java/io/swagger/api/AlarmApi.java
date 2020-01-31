/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.14).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.ErrorResponse;
import io.swagger.model.ModelApiResponse;
import java.util.UUID;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.CookieValue;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-01-31T04:54:18.490Z[GMT]")
@Api(value = "alarm", description = "the alarm API")
public interface AlarmApi {

    @ApiOperation(value = "", nickname = "startDeployment", notes = "Begin a deployment.", response = ModelApiResponse.class, tags={ "Alarms", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "response", response = ModelApiResponse.class) })
    @RequestMapping(value = "/alarm/deployment",
        produces = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<ModelApiResponse> startDeployment(@ApiParam(value = "",required=true) @PathVariable("deviceId") String deviceId,@ApiParam(value = "",required=true, allowableValues="true, false") @PathVariable("value") String value);


    @ApiOperation(value = "", nickname = "triggerInHandPixel", notes = "sets a dimmer to a specific value on a timer", response = ModelApiResponse.class, tags={ "Alarms", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "response", response = ModelApiResponse.class) })
    @RequestMapping(value = "/alarm/inhand-pixel",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<ModelApiResponse> triggerInHandPixel(@ApiParam(value = "",required=true) @PathVariable("deviceId") String deviceId,@ApiParam(value = "",required=true) @PathVariable("value") Integer value,@ApiParam(value = "",required=true) @PathVariable("timeunit") Integer timeunit,@ApiParam(value = "", allowableValues = "seconds, minutes, milliseconds") @Valid @RequestParam(value = "units", required = false) String units);


    @ApiOperation(value = "", nickname = "triggerInStorePixel", notes = "sets a dimmer to a specific value on a timer", response = ModelApiResponse.class, tags={ "Alarms", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "response", response = ModelApiResponse.class),
        @ApiResponse(code = 403, message = "Access Denied", response = ErrorResponse.class) })
    @RequestMapping(value = "/alarm/instore-pixel",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<ModelApiResponse> triggerInStorePixel(@ApiParam(value = "" ,required=true) @RequestHeader(value="Authorization", required=true) String authorization,@ApiParam(value = "" ,required=true) @RequestHeader(value="X-Device-Uuid", required=true) UUID xDeviceUuid);


    @ApiOperation(value = "", nickname = "updateDeployment", notes = "", response = ModelApiResponse.class, tags={ "Alarms", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "response", response = ModelApiResponse.class) })
    @RequestMapping(value = "/alarm/deployment",
        produces = { "application/json" }, 
        method = RequestMethod.PUT)
    ResponseEntity<ModelApiResponse> updateDeployment(@ApiParam(value = "",required=true) @PathVariable("deviceId") String deviceId,@ApiParam(value = "",required=true, allowableValues="true, false") @PathVariable("value") String value);

}
