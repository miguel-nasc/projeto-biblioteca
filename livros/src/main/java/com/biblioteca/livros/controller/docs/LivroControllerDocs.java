package com.biblioteca.livros.controller.docs;

import com.biblioteca.livros.dto.LivroDTO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

public interface LivroControllerDocs {

    @Operation(summary = "Get by id", description = "Getting a book by id", tags = {"Book"},
        responses = {
                @ApiResponse(description = "Sucess", responseCode = "200",
                    content = @Content(schema = @Schema(implementation = LivroDTO.class))),
                @ApiResponse(description = "No Content", responseCode = "204", content = @Content),
                @ApiResponse(description = "Bad Request", responseCode = "204", content = @Content),
                @ApiResponse(description = "Unauthorized", responseCode = "401", content = @Content),
                @ApiResponse(description = "Not Found", responseCode = "401", content = @Content),
                @ApiResponse(description = "Internal Server Error", responseCode = "500", content = @Content)})
    public LivroDTO id(Long id);


    @Operation(summary = "Get All Books", description = "Getting All Bokks", tags = {"Books"},
        responses = {
                @ApiResponse(description = "Sucess", responseCode = "200",
                    content = @Content(schema = @Schema(implementation = LivroDTO.class))),
                @ApiResponse(description = "No Content", responseCode = "204", content = @Content),
                @ApiResponse(description = "Bad Request", responseCode = "204", content = @Content),
                @ApiResponse(description = "Unauthorized", responseCode = "401", content = @Content),
                @ApiResponse(description = "Not Found", responseCode = "401", content = @Content),
                @ApiResponse(description = "Internal Server Error", responseCode = "500", content = @Content)})
    public LivroDTO all();


    @Operation(summary = "Delete a book", description = "Deleting a book", tags = {"Book"},
    responses = {
            @ApiResponse(description = "Sucess",
                    responseCode = "204", content = @Content(schema = @Schema(implementation = LivroDTO.class))),
            @ApiResponse(description = "Not Content", responseCode = "204", content = @Content),
            @ApiResponse(description = "Bad Request", responseCode = "204", content = @Content),
            @ApiResponse(description = "Unauthorized", responseCode = "404", content = @Content),
            @ApiResponse(description = "Not Found", responseCode = "404", content = @Content),
            @ApiResponse(description = "Internal Server Error", responseCode = "500", content = @Content)})
    public void delete(Long id);


    @Operation(summary = "Delete a book", description = "Deleting a book", tags = {"Book"},
            responses = {
                    @ApiResponse(description = "Sucess",
                            responseCode = "204", content = @Content(schema = @Schema(implementation = LivroDTO.class))),
                    @ApiResponse(description = "Not Content", responseCode = "204", content = @Content),
                    @ApiResponse(description = "Bad Request", responseCode = "204", content = @Content),
                    @ApiResponse(description = "Unauthorized", responseCode = "404", content = @Content),
                    @ApiResponse(description = "Not Found", responseCode = "404", content = @Content),
                    @ApiResponse(description = "Internal Server Error", responseCode = "500", content = @Content)})
    public LivroDTO save(LivroDTO livroDTO);


    @Operation(summary = "Delete a book", description = "Deleting a book", tags = {"Book"},
            responses = {
                    @ApiResponse(description = "Sucess",
                            responseCode = "204", content = @Content(schema = @Schema(implementation = LivroDTO.class))),
                    @ApiResponse(description = "Not Content", responseCode = "204", content = @Content),
                    @ApiResponse(description = "Bad Request", responseCode = "204", content = @Content),
                    @ApiResponse(description = "Unauthorized", responseCode = "404", content = @Content),
                    @ApiResponse(description = "Not Found", responseCode = "404", content = @Content),
                    @ApiResponse(description = "Internal Server Error", responseCode = "500", content = @Content)})
    public LivroDTO update(LivroDTO livroDTO);



}
