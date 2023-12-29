package org.example.exam;


import lombok.Data;

@Data
public class ApiResponse<T> {

    private final Integer code;

    private final String message;

    private final T data;

    private ApiResponse(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static <T> ApiResponse<T> success(T data) {
        return new ApiResponse<>(200, "success", data);
    }

    public static ApiResponse<Void> error(Integer code, String message) {
        return new ApiResponse<>(code, message, null);
    }
}
